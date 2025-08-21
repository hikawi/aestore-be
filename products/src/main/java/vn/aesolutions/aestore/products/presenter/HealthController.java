package vn.aesolutions.aestore.products.presenter;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import vn.aesolutions.aestore.products.dto.GetHealthResponse;

/**
 * Presenter for /health endpoints.
 */
@RestController
public final class HealthController {

  /**
   * GET /health: Returns a Hello, World message.
   *
   * This endpoint only serves as a simple way to check if the server has been
   * setup correctly.
   */
  @GetMapping("/health")
  public GetHealthResponse getHealth() {
    return new GetHealthResponse("Hello, World!");
  }

}
