package org.camunda.community.zeebe.testutils.stubs;

import static org.camunda.community.zeebe.testutils.stubs.ReflectionUtils.*;

import java.util.concurrent.TimeUnit;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ActivatedJobStub_Status_init_18579543155 {
  @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
  Object term817;

  public ActivatedJobStub_Status_init_18579543155() {}

  public <T> T unknown() {
    throw new IllegalStateException();
  }

  @Before
  public void setup() throws Throwable {
    term817 = new Integer(0);
  }

  @Test
  public void test() throws Throwable, Throwable {
    Class<?> klass =
        Class.forName("org.camunda.community.zeebe.testutils.stubs.ActivatedJobStub$Status");
    Class<?>[] argTypes = new Class<?>[2];
    argTypes[0] = Class.forName("java.lang.String");
    argTypes[1] = int.class;
    Object[] args = new Object[2];
    args[0] = null;
    args[1] = term817;
    Object instance = callConstructor(klass, argTypes, args);
  }
}
;
