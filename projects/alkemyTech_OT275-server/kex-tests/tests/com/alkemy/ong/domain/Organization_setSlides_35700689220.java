package com.alkemy.ong.domain;

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
import static com.alkemy.ong.domain.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.Integer;
import java.util.LinkedList;

public class Organization_setSlides_35700689220 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5631;
     Object term5795;

    public Organization_setSlides_35700689220() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term5632 = new Long(-8033714905181142681L);
        Long term5758 = new Long(-9040825890007374809L);
        Integer term5761 = new Integer(1655935355);
        Object term5757 = newInstance(Class.forName("com.alkemy.ong.domain.Slide"));
        setField(term5757, term5757.getClass(), "id", term5758);
        setField(term5757, term5757.getClass(), "imageUrl", "");
        setField(term5757, term5757.getClass(), "order", term5761);
        setField(term5757, term5757.getClass(), "text", "");
        setField(term5757, term5757.getClass(), "base64FileEncoded", "");
        setField(term5757, term5757.getClass(), "contentType", "");
        Long term5767 = new Long(1368340889161782793L);
        Integer term5770 = new Integer(-481533957);
        Object term5766 = newInstance(Class.forName("com.alkemy.ong.domain.Slide"));
        setField(term5766, term5766.getClass(), "id", term5767);
        setField(term5766, term5766.getClass(), "imageUrl", "");
        setField(term5766, term5766.getClass(), "order", term5770);
        setField(term5766, term5766.getClass(), "text", "");
        setField(term5766, term5766.getClass(), "base64FileEncoded", "");
        setField(term5766, term5766.getClass(), "contentType", "");
        Long term5776 = new Long(-5786861555969446503L);
        Integer term5779 = new Integer(1240914516);
        Object term5775 = newInstance(Class.forName("com.alkemy.ong.domain.Slide"));
        setField(term5775, term5775.getClass(), "id", term5776);
        setField(term5775, term5775.getClass(), "imageUrl", "");
        setField(term5775, term5775.getClass(), "order", term5779);
        setField(term5775, term5775.getClass(), "text", "");
        setField(term5775, term5775.getClass(), "base64FileEncoded", "");
        setField(term5775, term5775.getClass(), "contentType", "");
        Long term5785 = new Long(2354625302846375590L);
        Integer term5788 = new Integer(-1465035361);
        Object term5784 = newInstance(Class.forName("com.alkemy.ong.domain.Slide"));
        setField(term5784, term5784.getClass(), "id", term5785);
        setField(term5784, term5784.getClass(), "imageUrl", "");
        setField(term5784, term5784.getClass(), "order", term5788);
        setField(term5784, term5784.getClass(), "text", "");
        setField(term5784, term5784.getClass(), "base64FileEncoded", "");
        setField(term5784, term5784.getClass(), "contentType", "");
        ArrayList term5755 = new ArrayList();
        ((ArrayList) term5755).add(term5757);
        ((ArrayList) term5755).add(term5766);
        ((ArrayList) term5755).add(term5775);
        ((ArrayList) term5755).add(term5784);
        term5631 = newInstance(Class.forName("com.alkemy.ong.domain.Organization"));
        Object term5694 = newInstance(Class.forName("com.alkemy.ong.domain.SocialMedia"));
        setField(term5631, term5631.getClass(), "id", term5632);
        setField(term5631, term5631.getClass(), "name", "sEphiduvkv");
        setField(term5631, term5631.getClass(), "image", "PbLgCSAHce");
        setField(term5631, term5631.getClass(), "phone", "NWldOLAbqk");
        setField(term5631, term5631.getClass(), "address", "qnYaYSpDwO");
        setField(term5631, term5631.getClass(), "email", "dgbFDCdHtj");
        setField(term5694, term5694.getClass(), "facebookUrl", "EKpdCBubDE");
        setField(term5694, term5694.getClass(), "linkedInUrl", "zMsSLTfGhl");
        setField(term5694, term5694.getClass(), "instagramUrl", "bEmHScVZaQ");
        setField(term5631, term5631.getClass(), "socialMedia", term5694);
        setField(term5631, term5631.getClass(), "aboutUsText", "TcuXODkzBV");
        setField(term5631, term5631.getClass(), "welcomeText", "coJPjrBZNe");
        setField(term5631, term5631.getClass(), "slides", term5755);
        Long term5799 = new Long(7276637106827860087L);
        Integer term5813 = new Integer(1090617576);
        Object term5798 = newInstance(Class.forName("com.alkemy.ong.domain.Slide"));
        setField(term5798, term5798.getClass(), "id", term5799);
        setField(term5798, term5798.getClass(), "imageUrl", "UiWhvbypdr");
        setField(term5798, term5798.getClass(), "order", term5813);
        setField(term5798, term5798.getClass(), "text", "CgleElJNje");
        setField(term5798, term5798.getClass(), "base64FileEncoded", "ZrchvNGMtd");
        setField(term5798, term5798.getClass(), "contentType", "WaEcyVlcIx");
        Long term5853 = new Long(-3936701866695933852L);
        Integer term5856 = new Integer(-1547384488);
        Object term5852 = newInstance(Class.forName("com.alkemy.ong.domain.Slide"));
        setField(term5852, term5852.getClass(), "id", term5853);
        setField(term5852, term5852.getClass(), "imageUrl", "");
        setField(term5852, term5852.getClass(), "order", term5856);
        setField(term5852, term5852.getClass(), "text", "");
        setField(term5852, term5852.getClass(), "base64FileEncoded", "");
        setField(term5852, term5852.getClass(), "contentType", "");
        Long term5863 = new Long(1215116475929634177L);
        Integer term5865 = new Integer(1442160736);
        Object term5862 = newInstance(Class.forName("com.alkemy.ong.domain.Slide"));
        setField(term5862, term5862.getClass(), "id", term5863);
        setField(term5862, term5862.getClass(), "imageUrl", null);
        setField(term5862, term5862.getClass(), "order", term5865);
        setField(term5862, term5862.getClass(), "text", null);
        setField(term5862, term5862.getClass(), "base64FileEncoded", null);
        setField(term5862, term5862.getClass(), "contentType", null);
        term5795 = new LinkedList();
        ((LinkedList) term5795).add(term5798);
        ((LinkedList) term5795).add(term5852);
        ((LinkedList) term5795).add(term5862);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.domain.Organization");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term5795;
        callMethod(klass, "setSlides", argTypes, term5631, args);
    }

};


