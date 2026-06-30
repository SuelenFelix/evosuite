package com.alkemy.ong.application.service.organization;

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
import static com.alkemy.ong.application.service.organization.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.Integer;

public class UpdateOrganizationUseCaseService_update_14491707240 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term2;

    public UpdateOrganizationUseCaseService_update_14491707240() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("com.alkemy.ong.application.service.organization.UpdateOrganizationUseCaseService"));
        setField(term1, term1.getClass(), "organizationRepository", null);
        Long term3 = new Long(2442117782898005296L);
        Long term129 = new Long(6375119433582206027L);
        Integer term132 = new Integer(568599855);
        Object term128 = newInstance(Class.forName("com.alkemy.ong.domain.Slide"));
        setField(term128, term128.getClass(), "id", term129);
        setField(term128, term128.getClass(), "imageUrl", "");
        setField(term128, term128.getClass(), "order", term132);
        setField(term128, term128.getClass(), "text", "");
        setField(term128, term128.getClass(), "base64FileEncoded", "");
        setField(term128, term128.getClass(), "contentType", "");
        Long term138 = new Long(-8257434502486459194L);
        Integer term141 = new Integer(1162663216);
        Object term137 = newInstance(Class.forName("com.alkemy.ong.domain.Slide"));
        setField(term137, term137.getClass(), "id", term138);
        setField(term137, term137.getClass(), "imageUrl", "");
        setField(term137, term137.getClass(), "order", term141);
        setField(term137, term137.getClass(), "text", "");
        setField(term137, term137.getClass(), "base64FileEncoded", "");
        setField(term137, term137.getClass(), "contentType", "");
        Long term147 = new Long(-8400487765614892086L);
        Integer term150 = new Integer(1484323161);
        Object term146 = newInstance(Class.forName("com.alkemy.ong.domain.Slide"));
        setField(term146, term146.getClass(), "id", term147);
        setField(term146, term146.getClass(), "imageUrl", "");
        setField(term146, term146.getClass(), "order", term150);
        setField(term146, term146.getClass(), "text", "");
        setField(term146, term146.getClass(), "base64FileEncoded", "");
        setField(term146, term146.getClass(), "contentType", "");
        Long term156 = new Long(5270370404989704783L);
        Integer term159 = new Integer(391863371);
        Object term155 = newInstance(Class.forName("com.alkemy.ong.domain.Slide"));
        setField(term155, term155.getClass(), "id", term156);
        setField(term155, term155.getClass(), "imageUrl", "");
        setField(term155, term155.getClass(), "order", term159);
        setField(term155, term155.getClass(), "text", "");
        setField(term155, term155.getClass(), "base64FileEncoded", "");
        setField(term155, term155.getClass(), "contentType", "");
        Long term165 = new Long(7411271909051562686L);
        Integer term168 = new Integer(-1922583790);
        Object term164 = newInstance(Class.forName("com.alkemy.ong.domain.Slide"));
        setField(term164, term164.getClass(), "id", term165);
        setField(term164, term164.getClass(), "imageUrl", "");
        setField(term164, term164.getClass(), "order", term168);
        setField(term164, term164.getClass(), "text", "");
        setField(term164, term164.getClass(), "base64FileEncoded", "");
        setField(term164, term164.getClass(), "contentType", "");
        ArrayList term126 = new ArrayList();
        ((ArrayList) term126).add(term128);
        ((ArrayList) term126).add(term137);
        ((ArrayList) term126).add(term146);
        ((ArrayList) term126).add(term155);
        ((ArrayList) term126).add(term164);
        term2 = newInstance(Class.forName("com.alkemy.ong.domain.Organization"));
        Object term65 = newInstance(Class.forName("com.alkemy.ong.domain.SocialMedia"));
        setField(term2, term2.getClass(), "id", term3);
        setField(term2, term2.getClass(), "name", "PAEBtnZtTD");
        setField(term2, term2.getClass(), "image", "sjlJAEtRrb");
        setField(term2, term2.getClass(), "phone", "MuLcgQHgqz");
        setField(term2, term2.getClass(), "address", "xxtlPwDYFs");
        setField(term2, term2.getClass(), "email", "jJCZpVmanW");
        setField(term65, term65.getClass(), "facebookUrl", "EGtDIRbSSb");
        setField(term65, term65.getClass(), "linkedInUrl", "SzjVpOQTyS");
        setField(term65, term65.getClass(), "instagramUrl", "MjGYSRKTNF");
        setField(term2, term2.getClass(), "socialMedia", term65);
        setField(term2, term2.getClass(), "aboutUsText", "hRNSzYYIrc");
        setField(term2, term2.getClass(), "welcomeText", "RMFIsYGgne");
        setField(term2, term2.getClass(), "slides", term126);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.application.service.organization.UpdateOrganizationUseCaseService");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.alkemy.ong.domain.Organization");
        Object[] args = new Object[1];
        args[0] = term2;
        callMethod(klass, "update", argTypes, term1, args);
    }

};


