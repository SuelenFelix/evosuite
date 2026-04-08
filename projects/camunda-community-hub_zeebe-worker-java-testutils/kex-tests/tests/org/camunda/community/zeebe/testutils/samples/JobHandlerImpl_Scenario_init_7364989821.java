package org.camunda.community.zeebe.testutils.samples;

import static org.camunda.community.zeebe.testutils.samples.ReflectionUtils.*;

import java.util.concurrent.TimeUnit;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class JobHandlerImpl_Scenario_init_7364989821 {
  @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
  Object term1;

  public JobHandlerImpl_Scenario_init_7364989821() {}

  public <T> T unknown() {
    throw new IllegalStateException();
  }

  @Before
  public void setup() throws Throwable {
    term1 = new Integer(0);
  }

  @Test
  public void test() throws Throwable, Throwable {
    Class<?> klass =
        Class.forName("org.camunda.community.zeebe.testutils.samples.JobHandlerImpl$Scenario");
    Class<?>[] argTypes = new Class<?>[2];
    argTypes[0] = Class.forName("java.lang.String");
    argTypes[1] = int.class;
    Object[] args = new Object[2];
    args[0] = null;
    args[1] = term1;
    Object instance = callConstructor(klass, argTypes, args);
  }
}
;
