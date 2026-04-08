package org.camunda.community.zeebe.testutils;

import static org.camunda.community.zeebe.testutils.ReflectionUtils.*;

import java.util.concurrent.TimeUnit;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ZeebeWorkerAssertions_init_5710017380 {
  @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);

  public ZeebeWorkerAssertions_init_5710017380() {}

  public <T> T unknown() {
    throw new IllegalStateException();
  }

  @Before
  public void setup() throws Throwable {}

  @Test
  public void test() throws Throwable, Throwable {
    Class<?> klass = Class.forName("org.camunda.community.zeebe.testutils.ZeebeWorkerAssertions");
    Class<?>[] argTypes = new Class<?>[0];
    Object[] args = new Object[0];
    Object instance = callConstructor(klass, argTypes, args);
  }
}
;
