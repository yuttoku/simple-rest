package com.example.demo.application.controller;

import com.example.demo.application.resource.RepositoryIssueResource;
import com.example.demo.domain.resository.dto.repositoryissue.RepositoryIssueDTO;
import com.example.demo.domain.service.RepositoryIssueService;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author Yudai Tokunaga
 */
@RestController
@RequestMapping("/api/repos/{owner}/{repo}/issues")
public class RepositoryIssuesRestController {

    private final RepositoryIssueService repositoryIssueService;

    public RepositoryIssuesRestController(RepositoryIssueService repositoryIssueService) {
        this.repositoryIssueService = repositoryIssueService;
    }

    /**
     * Request Example
     * curl -v -X GET http://localhost:8080/api/repos/spring-projects/spring-boot/issues
     * curl -v -X GET http://localhost:8080/api/repos/spring-projects/spring-boot/issues?page=1&per_page=10
     */
    @GetMapping
    public List<RepositoryIssueResource> getRepositoryIssues(
            @PathVariable("owner") String owner,
            @PathVariable("repo") String repo,
            @RequestParam Map<String, String> params) {
        List<RepositoryIssueDTO> repositoryIssues = repositoryIssueService.search(owner, repo, params);
        return repositoryIssues.stream().map(RepositoryIssueResource::new).collect(Collectors.toList());
    }
}
