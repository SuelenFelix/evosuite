package com.alkemy.ong.infrastructure.rest.mapper.organization;

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
import static com.alkemy.ong.infrastructure.rest.mapper.organization.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;
import java.util.ArrayList;
import java.lang.Integer;

public class GetOrganizationMapper_toResponse_6308483940 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term503;
     Object term506;

    public GetOrganizationMapper_toResponse_6308483940() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term503 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.mapper.organization.GetOrganizationMapper"));
        Object term504 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.mapper.slide.SlideWithTextMapper"));
        Object term505 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.mapper.common.SocialMediaMapper"));
        setField(term503, term503.getClass(), "slideWithTextMapper", term504);
        setField(term503, term503.getClass(), "socialMediaMapper", term505);
        Long term507 = new Long(4872422362414183754L);
        Long term633 = new Long(6811161968424632369L);
        Integer term636 = new Integer(-616727354);
        Object term632 = newInstance(Class.forName("com.alkemy.ong.domain.Slide"));
        setField(term632, term632.getClass(), "id", term633);
        setField(term632, term632.getClass(), "imageUrl", "");
        setField(term632, term632.getClass(), "order", term636);
        setField(term632, term632.getClass(), "text", "");
        setField(term632, term632.getClass(), "base64FileEncoded", "");
        setField(term632, term632.getClass(), "contentType", "");
        Long term642 = new Long(-7237588299778557629L);
        Integer term645 = new Integer(-1955890973);
        Object term641 = newInstance(Class.forName("com.alkemy.ong.domain.Slide"));
        setField(term641, term641.getClass(), "id", term642);
        setField(term641, term641.getClass(), "imageUrl", "");
        setField(term641, term641.getClass(), "order", term645);
        setField(term641, term641.getClass(), "text", "");
        setField(term641, term641.getClass(), "base64FileEncoded", "");
        setField(term641, term641.getClass(), "contentType", "");
        Long term651 = new Long(6967924379644551255L);
        Integer term654 = new Integer(-2038273078);
        Object term650 = newInstance(Class.forName("com.alkemy.ong.domain.Slide"));
        setField(term650, term650.getClass(), "id", term651);
        setField(term650, term650.getClass(), "imageUrl", "");
        setField(term650, term650.getClass(), "order", term654);
        setField(term650, term650.getClass(), "text", "");
        setField(term650, term650.getClass(), "base64FileEncoded", "");
        setField(term650, term650.getClass(), "contentType", "");
        Long term660 = new Long(-2813493605142626659L);
        Integer term663 = new Integer(1227103734);
        Object term659 = newInstance(Class.forName("com.alkemy.ong.domain.Slide"));
        setField(term659, term659.getClass(), "id", term660);
        setField(term659, term659.getClass(), "imageUrl", "");
        setField(term659, term659.getClass(), "order", term663);
        setField(term659, term659.getClass(), "text", "");
        setField(term659, term659.getClass(), "base64FileEncoded", "");
        setField(term659, term659.getClass(), "contentType", "");
        ArrayList term630 = new ArrayList();
        ((ArrayList) term630).add(term632);
        ((ArrayList) term630).add(term641);
        ((ArrayList) term630).add(term650);
        ((ArrayList) term630).add(term659);
        term506 = newInstance(Class.forName("com.alkemy.ong.domain.Organization"));
        Object term569 = newInstance(Class.forName("com.alkemy.ong.domain.SocialMedia"));
        setField(term506, term506.getClass(), "id", term507);
        setField(term506, term506.getClass(), "name", "wSQxaModmm");
        setField(term506, term506.getClass(), "image", "UlajhuVLaP");
        setField(term506, term506.getClass(), "phone", "gGSMzuGICf");
        setField(term506, term506.getClass(), "address", "hxCBltsObl");
        setField(term506, term506.getClass(), "email", "BndsHwAFMv");
        setField(term569, term569.getClass(), "facebookUrl", "GzFkzHGYFt");
        setField(term569, term569.getClass(), "linkedInUrl", "tShwQLRGNe");
        setField(term569, term569.getClass(), "instagramUrl", "LvtrsXUliU");
        setField(term506, term506.getClass(), "socialMedia", term569);
        setField(term506, term506.getClass(), "aboutUsText", "xLbjWUgOIL");
        setField(term506, term506.getClass(), "welcomeText", "jDtqGUpnZN");
        setField(term506, term506.getClass(), "slides", term630);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.mapper.organization.GetOrganizationMapper");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.alkemy.ong.domain.Organization");
        Object[] args = new Object[1];
        args[0] = term506;
        callMethod(klass, "toResponse", argTypes, term503, args);
    }

};


