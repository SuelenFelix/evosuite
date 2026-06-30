package kyungseo.poc.simple.web.site.admin.usermgmt.web.dto;

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
import static kyungseo.poc.simple.web.site.admin.usermgmt.web.dto.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.ArrayList;
import java.lang.Object;

public class AdmUserDTO_setSecret_206782333726 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10601;

    public AdmUserDTO_setSecret_206782333726() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term10602 = new Long(204473662283899955L);
        Boolean term10640 = new Boolean(true);
        Integer term10642 = new Integer(729658803);
        Boolean term10680 = new Boolean(false);
        Long term10697 = new Long(-4029227951294167228L);
        ArrayList term10699 = new ArrayList();
        ((ArrayList) term10699).add((Object)null);
        ((ArrayList) term10699).add((Object)null);
        ArrayList term10702 = new ArrayList();
        Object term10696 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term10696, term10696.getClass(), "id", term10697);
        setField(term10696, term10696.getClass(), "users", term10699);
        setField(term10696, term10696.getClass(), "privileges", term10702);
        setField(term10696, term10696.getClass(), "name", "");
        Long term10707 = new Long(6978548804004471804L);
        ArrayList term10709 = new ArrayList();
        ((ArrayList) term10709).add((Object)null);
        ArrayList term10712 = new ArrayList();
        ((ArrayList) term10712).add((Object)null);
        ((ArrayList) term10712).add((Object)null);
        ((ArrayList) term10712).add((Object)null);
        ((ArrayList) term10712).add((Object)null);
        ((ArrayList) term10712).add((Object)null);
        ((ArrayList) term10712).add((Object)null);
        ((ArrayList) term10712).add((Object)null);
        Object term10706 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term10706, term10706.getClass(), "id", term10707);
        setField(term10706, term10706.getClass(), "users", term10709);
        setField(term10706, term10706.getClass(), "privileges", term10712);
        setField(term10706, term10706.getClass(), "name", "");
        Long term10717 = new Long(-5761087225966065493L);
        ArrayList term10719 = new ArrayList();
        ((ArrayList) term10719).add((Object)null);
        ((ArrayList) term10719).add((Object)null);
        ((ArrayList) term10719).add((Object)null);
        ((ArrayList) term10719).add((Object)null);
        ((ArrayList) term10719).add((Object)null);
        ((ArrayList) term10719).add((Object)null);
        ArrayList term10722 = new ArrayList();
        ((ArrayList) term10722).add((Object)null);
        Object term10716 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term10716, term10716.getClass(), "id", term10717);
        setField(term10716, term10716.getClass(), "users", term10719);
        setField(term10716, term10716.getClass(), "privileges", term10722);
        setField(term10716, term10716.getClass(), "name", "");
        ArrayList term10694 = new ArrayList();
        ((ArrayList) term10694).add(term10696);
        ((ArrayList) term10694).add(term10706);
        ((ArrayList) term10694).add(term10716);
        term10601 = newInstance(Class.forName("kyungseo.poc.simple.web.site.admin.usermgmt.web.dto.AdmUserDTO"));
        Object term10728 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term10729 = newInstance(Class.forName("java.time.LocalDate"));
        Object term10733 = newInstance(Class.forName("java.time.LocalTime"));
        Object term10738 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term10739 = newInstance(Class.forName("java.time.LocalDate"));
        Object term10743 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term10601, term10601.getClass(), "id", term10602);
        setField(term10601, term10601.getClass(), "membername", "NMANMKfctU");
        setField(term10601, term10601.getClass(), "email", "mQsaqUltLU");
        setField(term10601, term10601.getClass(), "password", "jwENwZiGlR");
        setField(term10601, term10601.getClass(), "enabled", term10640);
        setField(term10601, term10601.getClass(), "age", term10642);
        setField(term10601, term10601.getClass(), "phoneNumber", "rfFHGPcfpz");
        setField(term10601, term10601.getClass(), "country", "fViQeyMrrL");
        setField(term10601, term10601.getClass(), "birthdate", "zzeaToyLmI");
        setField(term10601, term10601.getClass(), "isUsing2FA", term10680);
        setField(term10601, term10601.getClass(), "secret", "sKYWhmRMLx");
        setField(term10601, term10601.getClass(), "roles", term10694);
        setIntField(term10729, term10729.getClass(), "year", 2013);
        setShortField(term10729, term10729.getClass(), "month", (short) 7);
        setShortField(term10729, term10729.getClass(), "day", (short) 2);
        setField(term10728, term10728.getClass(), "date", term10729);
        setByteField(term10733, term10733.getClass(), "hour", (byte) 12);
        setByteField(term10733, term10733.getClass(), "minute", (byte) 16);
        setByteField(term10733, term10733.getClass(), "second", (byte) 13);
        setIntField(term10733, term10733.getClass(), "nano", 479538808);
        setField(term10728, term10728.getClass(), "time", term10733);
        setField(term10601, term10601.getClass(), "regDate", term10728);
        setIntField(term10739, term10739.getClass(), "year", 2012);
        setShortField(term10739, term10739.getClass(), "month", (short) 10);
        setShortField(term10739, term10739.getClass(), "day", (short) 26);
        setField(term10738, term10738.getClass(), "date", term10739);
        setByteField(term10743, term10743.getClass(), "hour", (byte) 13);
        setByteField(term10743, term10743.getClass(), "minute", (byte) 50);
        setByteField(term10743, term10743.getClass(), "second", (byte) 34);
        setIntField(term10743, term10743.getClass(), "nano", 738625041);
        setField(term10738, term10738.getClass(), "time", term10743);
        setField(term10601, term10601.getClass(), "modDate", term10738);
        setField(term10601, term10601.getClass(), "date", "orHcHVrwHz");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.site.admin.usermgmt.web.dto.AdmUserDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "mkEWcQdwUn";
        callMethod(klass, "setSecret", argTypes, term10601, args);
    }

};


