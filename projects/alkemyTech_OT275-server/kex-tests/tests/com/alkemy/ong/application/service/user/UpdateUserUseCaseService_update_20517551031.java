package com.alkemy.ong.application.service.user;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import static com.alkemy.ong.application.service.user.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;

public class UpdateUserUseCaseService_update_20517551031 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term184;
     Object term185;
     Object term287;

    public UpdateUserUseCaseService_update_20517551031() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term184 = newInstance(Class.forName("com.alkemy.ong.application.service.user.UpdateUserUseCaseService"));
        setField(term184, term184.getClass(), "userRepository", null);
        Long term186 = new Long(-8257434502486459194L);
        Long term249 = new Long(-8400487765614892086L);
        term185 = newInstance(Class.forName("com.alkemy.ong.domain.User"));
        Object term248 = newInstance(Class.forName("com.alkemy.ong.domain.Role"));
        setField(term185, term185.getClass(), "id", term186);
        setField(term185, term185.getClass(), "firstName", "hRNSzYYIrc");
        setField(term185, term185.getClass(), "lastName", "RMFIsYGgne");
        setField(term185, term185.getClass(), "email", "NRdvgJlhkX");
        setField(term185, term185.getClass(), "password", "uuaPigETmJ");
        setField(term185, term185.getClass(), "imageUrl", "MxlszYVzRf");
        setField(term248, term248.getClass(), "id", term249);
        setField(term248, term248.getClass(), "name", "LQFpaHEwXR");
        setField(term248, term248.getClass(), "description", "oVcInYnLWB");
        setField(term185, term185.getClass(), "role", term248);
        setField(term185, term185.getClass(), "token", "aJlieCFVtF");
        Long term288 = new Long(5270370404989704783L);
        Long term351 = new Long(7411271909051562686L);
        term287 = newInstance(Class.forName("com.alkemy.ong.domain.User"));
        Object term350 = newInstance(Class.forName("com.alkemy.ong.domain.Role"));
        setField(term287, term287.getClass(), "id", term288);
        setField(term287, term287.getClass(), "firstName", "ZiaGIbnzTs");
        setField(term287, term287.getClass(), "lastName", "tbcdzjIfER");
        setField(term287, term287.getClass(), "email", "HyxfbSQYBe");
        setField(term287, term287.getClass(), "password", "pCTimMblYc");
        setField(term287, term287.getClass(), "imageUrl", "hNxWaHcfhY");
        setField(term350, term350.getClass(), "id", term351);
        setField(term350, term350.getClass(), "name", "RkybSrpybU");
        setField(term350, term350.getClass(), "description", "xOEqzGAmDU");
        setField(term287, term287.getClass(), "role", term350);
        setField(term287, term287.getClass(), "token", "eZFUvlxvGV");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.application.service.user.UpdateUserUseCaseService");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.alkemy.ong.domain.User");
        argTypes[1] = Class.forName("com.alkemy.ong.domain.User");
        Object[] args = new Object[2];
        args[0] = term185;
        args[1] = term287;
        callMethod(klass, "update", argTypes, term184, args);
    }

};


