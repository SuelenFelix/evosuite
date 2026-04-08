package org.camunda.community.zeebe.testutils.samples;

import static org.camunda.community.zeebe.testutils.samples.ReflectionUtils.*;

import java.util.concurrent.TimeUnit;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class JobHandlerImpl_Scenario_init_7364989820 {
  @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);

  public JobHandlerImpl_Scenario_init_7364989820() {}

  public <T> T unknown() {
    throw new IllegalStateException();
  }

  @Before
  public void setup() throws Throwable {}

  @Test
  public void test() throws Throwable, Throwable {
    Class<?> klass =
        Class.forName("org.camunda.community.zeebe.testutils.samples.JobHandlerImpl$Scenario");
    Class<?>[] argTypes = new Class<?>[2];
    argTypes[0] = Class.forName("java.lang.String");
    argTypes[1] = int.class;
    Object[] args = new Object[2];
    Object instance = callConstructor(klass, argTypes, args);
  }
}
;
