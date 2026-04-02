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

public class UpdateOrganizationUseCaseService_changeNotNullFields_7823788001 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term275;
     Object term276;
     Object term440;

    public UpdateOrganizationUseCaseService_changeNotNullFields_7823788001() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term275 = newInstance(Class.forName("com.alkemy.ong.application.service.organization.UpdateOrganizationUseCaseService"));
        setField(term275, term275.getClass(), "organizationRepository", null);
        Long term277 = new Long(4872422362414183754L);
        Long term403 = new Long(6811161968424632369L);
        Integer term406 = new Integer(-616727354);
        Object term402 = newInstance(Class.forName("com.alkemy.ong.domain.Slide"));
        setField(term402, term402.getClass(), "id", term403);
        setField(term402, term402.getClass(), "imageUrl", "");
        setField(term402, term402.getClass(), "order", term406);
        setField(term402, term402.getClass(), "text", "");
        setField(term402, term402.getClass(), "base64FileEncoded", "");
        setField(term402, term402.getClass(), "contentType", "");
        Long term412 = new Long(-7237588299778557629L);
        Integer term415 = new Integer(-1955890973);
        Object term411 = newInstance(Class.forName("com.alkemy.ong.domain.Slide"));
        setField(term411, term411.getClass(), "id", term412);
        setField(term411, term411.getClass(), "imageUrl", "");
        setField(term411, term411.getClass(), "order", term415);
        setField(term411, term411.getClass(), "text", "");
        setField(term411, term411.getClass(), "base64FileEncoded", "");
        setField(term411, term411.getClass(), "contentType", "");
        Long term421 = new Long(6967924379644551255L);
        Integer term424 = new Integer(-2038273078);
        Object term420 = newInstance(Class.forName("com.alkemy.ong.domain.Slide"));
        setField(term420, term420.getClass(), "id", term421);
        setField(term420, term420.getClass(), "imageUrl", "");
        setField(term420, term420.getClass(), "order", term424);
        setField(term420, term420.getClass(), "text", "");
        setField(term420, term420.getClass(), "base64FileEncoded", "");
        setField(term420, term420.getClass(), "contentType", "");
        Long term430 = new Long(-2813493605142626659L);
        Integer term433 = new Integer(1227103734);
        Object term429 = newInstance(Class.forName("com.alkemy.ong.domain.Slide"));
        setField(term429, term429.getClass(), "id", term430);
        setField(term429, term429.getClass(), "imageUrl", "");
        setField(term429, term429.getClass(), "order", term433);
        setField(term429, term429.getClass(), "text", "");
        setField(term429, term429.getClass(), "base64FileEncoded", "");
        setField(term429, term429.getClass(), "contentType", "");
        ArrayList term400 = new ArrayList();
        ((ArrayList) term400).add(term402);
        ((ArrayList) term400).add(term411);
        ((ArrayList) term400).add(term420);
        ((ArrayList) term400).add(term429);
        term276 = newInstance(Class.forName("com.alkemy.ong.domain.Organization"));
        Object term339 = newInstance(Class.forName("com.alkemy.ong.domain.SocialMedia"));
        setField(term276, term276.getClass(), "id", term277);
        setField(term276, term276.getClass(), "name", "OWDIEULEFu");
        setField(term276, term276.getClass(), "image", "dWRymuLBtr");
        setField(term276, term276.getClass(), "phone", "AijpHYOFuy");
        setField(term276, term276.getClass(), "address", "SbAoxhfrkn");
        setField(term276, term276.getClass(), "email", "kuTXqwMtDB");
        setField(term339, term339.getClass(), "facebookUrl", "Ghbwtircqb");
        setField(term339, term339.getClass(), "linkedInUrl", "xrwlQZdwCp");
        setField(term339, term339.getClass(), "instagramUrl", "IDCWpPLRkE");
        setField(term276, term276.getClass(), "socialMedia", term339);
        setField(term276, term276.getClass(), "aboutUsText", "nyiiPDVjAc");
        setField(term276, term276.getClass(), "welcomeText", "aKnKipADSo");
        setField(term276, term276.getClass(), "slides", term400);
        Long term441 = new Long(-8885298608300233488L);
        Long term567 = new Long(-4325723315152823407L);
        Integer term570 = new Integer(-1339778481);
        Object term566 = newInstance(Class.forName("com.alkemy.ong.domain.Slide"));
        setField(term566, term566.getClass(), "id", term567);
        setField(term566, term566.getClass(), "imageUrl", "");
        setField(term566, term566.getClass(), "order", term570);
        setField(term566, term566.getClass(), "text", "");
        setField(term566, term566.getClass(), "base64FileEncoded", "");
        setField(term566, term566.getClass(), "contentType", "");
        Long term576 = new Long(2535595959091595249L);
        Integer term579 = new Integer(1725571209);
        Object term575 = newInstance(Class.forName("com.alkemy.ong.domain.Slide"));
        setField(term575, term575.getClass(), "id", term576);
        setField(term575, term575.getClass(), "imageUrl", "");
        setField(term575, term575.getClass(), "order", term579);
        setField(term575, term575.getClass(), "text", "");
        setField(term575, term575.getClass(), "base64FileEncoded", "");
        setField(term575, term575.getClass(), "contentType", "");
        Long term585 = new Long(-5476826692763582090L);
        Integer term588 = new Integer(-522618178);
        Object term584 = newInstance(Class.forName("com.alkemy.ong.domain.Slide"));
        setField(term584, term584.getClass(), "id", term585);
        setField(term584, term584.getClass(), "imageUrl", "");
        setField(term584, term584.getClass(), "order", term588);
        setField(term584, term584.getClass(), "text", "");
        setField(term584, term584.getClass(), "base64FileEncoded", "");
        setField(term584, term584.getClass(), "contentType", "");
        ArrayList term564 = new ArrayList();
        ((ArrayList) term564).add(term566);
        ((ArrayList) term564).add(term575);
        ((ArrayList) term564).add(term584);
        term440 = newInstance(Class.forName("com.alkemy.ong.domain.Organization"));
        Object term503 = newInstance(Class.forName("com.alkemy.ong.domain.SocialMedia"));
        setField(term440, term440.getClass(), "id", term441);
        setField(term440, term440.getClass(), "name", "ffYhPOzlUs");
        setField(term440, term440.getClass(), "image", "MLqYREekMl");
        setField(term440, term440.getClass(), "phone", "ytSBIKXogI");
        setField(term440, term440.getClass(), "address", "nHXjMycHlU");
        setField(term440, term440.getClass(), "email", "ieCtQFdkii");
        setField(term503, term503.getClass(), "facebookUrl", "dEnhdmILtU");
        setField(term503, term503.getClass(), "linkedInUrl", "hoicvmsovO");
        setField(term503, term503.getClass(), "instagramUrl", "eqJfYWRaEL");
        setField(term440, term440.getClass(), "socialMedia", term503);
        setField(term440, term440.getClass(), "aboutUsText", "fhkbdRViHi");
        setField(term440, term440.getClass(), "welcomeText", "uWHnvSvaPl");
        setField(term440, term440.getClass(), "slides", term564);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.application.service.organization.UpdateOrganizationUseCaseService");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.alkemy.ong.domain.Organization");
        argTypes[1] = Class.forName("com.alkemy.ong.domain.Organization");
        Object[] args = new Object[2];
        args[0] = term276;
        args[1] = term440;
        callMethod(klass, "changeNotNullFields", argTypes, term275, args);
    }

};


