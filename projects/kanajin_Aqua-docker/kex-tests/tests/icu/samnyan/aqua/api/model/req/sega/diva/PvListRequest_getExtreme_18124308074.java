package icu.samnyan.aqua.api.model.req.sega.diva;

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
import static icu.samnyan.aqua.api.model.req.sega.diva.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;

public class PvListRequest_getExtreme_18124308074 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term401364;

    public PvListRequest_getExtreme_18124308074() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term401377 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        Object term401381 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        Object term401382 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        setIntField(term401377, term401377.getClass(), "PVID", 1144898280);
        setIntField(term401377, term401377.getClass(), "Version", -207823135);
        setIntField(term401377, term401377.getClass(), "Edition", -1679424463);
        setField(term401381, term401381.getClass(), "Start", null);
        setField(term401381, term401381.getClass(), "End", null);
        setField(term401377, term401377.getClass(), "AdvDemo", term401381);
        setField(term401382, term401382.getClass(), "Start", null);
        setField(term401382, term401382.getClass(), "End", null);
        setField(term401377, term401377.getClass(), "Playable", term401382);
        Object term401383 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        Object term401387 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        Object term401388 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        setIntField(term401383, term401383.getClass(), "PVID", 666784928);
        setIntField(term401383, term401383.getClass(), "Version", 641998466);
        setIntField(term401383, term401383.getClass(), "Edition", -1572610248);
        setField(term401387, term401387.getClass(), "Start", null);
        setField(term401387, term401387.getClass(), "End", null);
        setField(term401383, term401383.getClass(), "AdvDemo", term401387);
        setField(term401388, term401388.getClass(), "Start", null);
        setField(term401388, term401388.getClass(), "End", null);
        setField(term401383, term401383.getClass(), "Playable", term401388);
        Object term401389 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        Object term401393 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        Object term401394 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        setIntField(term401389, term401389.getClass(), "PVID", 1012919653);
        setIntField(term401389, term401389.getClass(), "Version", 1827367644);
        setIntField(term401389, term401389.getClass(), "Edition", -1658843014);
        setField(term401393, term401393.getClass(), "Start", null);
        setField(term401393, term401393.getClass(), "End", null);
        setField(term401389, term401389.getClass(), "AdvDemo", term401393);
        setField(term401394, term401394.getClass(), "Start", null);
        setField(term401394, term401394.getClass(), "End", null);
        setField(term401389, term401389.getClass(), "Playable", term401394);
        Object term401395 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        Object term401399 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        Object term401400 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        setIntField(term401395, term401395.getClass(), "PVID", 1075535234);
        setIntField(term401395, term401395.getClass(), "Version", 1945495577);
        setIntField(term401395, term401395.getClass(), "Edition", -1726807061);
        setField(term401399, term401399.getClass(), "Start", null);
        setField(term401399, term401399.getClass(), "End", null);
        setField(term401395, term401395.getClass(), "AdvDemo", term401399);
        setField(term401400, term401400.getClass(), "Start", null);
        setField(term401400, term401400.getClass(), "End", null);
        setField(term401395, term401395.getClass(), "Playable", term401400);
        Object term401401 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        Object term401405 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        Object term401406 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        setIntField(term401401, term401401.getClass(), "PVID", -1515018158);
        setIntField(term401401, term401401.getClass(), "Version", -435822872);
        setIntField(term401401, term401401.getClass(), "Edition", -1560942915);
        setField(term401405, term401405.getClass(), "Start", null);
        setField(term401405, term401405.getClass(), "End", null);
        setField(term401401, term401401.getClass(), "AdvDemo", term401405);
        setField(term401406, term401406.getClass(), "Start", null);
        setField(term401406, term401406.getClass(), "End", null);
        setField(term401401, term401401.getClass(), "Playable", term401406);
        Object term401407 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        setIntField(term401407, term401407.getClass(), "PVID", 1655623341);
        setIntField(term401407, term401407.getClass(), "Version", 2084318972);
        setIntField(term401407, term401407.getClass(), "Edition", -501591952);
        setField(term401407, term401407.getClass(), "AdvDemo", term401400);
        setField(term401407, term401407.getClass(), "Playable", term401405);
        Object term401411 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        setIntField(term401411, term401411.getClass(), "PVID", -1565343007);
        setIntField(term401411, term401411.getClass(), "Version", -1759657304);
        setIntField(term401411, term401411.getClass(), "Edition", 1048512141);
        setField(term401411, term401411.getClass(), "AdvDemo", term401381);
        setField(term401411, term401411.getClass(), "Playable", term401394);
        Object term401415 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        setIntField(term401415, term401415.getClass(), "PVID", 1734934178);
        setIntField(term401415, term401415.getClass(), "Version", 370083339);
        setIntField(term401415, term401415.getClass(), "Edition", 295311951);
        setField(term401415, term401415.getClass(), "AdvDemo", term401388);
        setField(term401415, term401415.getClass(), "Playable", term401382);
        ArrayList term401375 = new ArrayList();
        ((ArrayList) term401375).add(term401377);
        ((ArrayList) term401375).add(term401383);
        ((ArrayList) term401375).add(term401389);
        ((ArrayList) term401375).add(term401395);
        ((ArrayList) term401375).add(term401401);
        ((ArrayList) term401375).add(term401407);
        ((ArrayList) term401375).add(term401411);
        ((ArrayList) term401375).add(term401415);
        ArrayList term401421 = new ArrayList();
        Object term401427 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        setIntField(term401427, term401427.getClass(), "PVID", -1073458896);
        setIntField(term401427, term401427.getClass(), "Version", 505799534);
        setIntField(term401427, term401427.getClass(), "Edition", 1403710409);
        setField(term401427, term401427.getClass(), "AdvDemo", term401382);
        setField(term401427, term401427.getClass(), "Playable", term401406);
        Object term401431 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        setIntField(term401431, term401431.getClass(), "PVID", 152972678);
        setIntField(term401431, term401431.getClass(), "Version", 982487900);
        setIntField(term401431, term401431.getClass(), "Edition", -930124212);
        setField(term401431, term401431.getClass(), "AdvDemo", term401400);
        setField(term401431, term401431.getClass(), "Playable", term401400);
        ArrayList term401425 = new ArrayList();
        ((ArrayList) term401425).add(term401427);
        ((ArrayList) term401425).add(term401431);
        ((ArrayList) term401425).add(term401401);
        ((ArrayList) term401425).add(term401431);
        ((ArrayList) term401425).add(term401415);
        ((ArrayList) term401425).add(term401407);
        ArrayList term401437 = new ArrayList();
        ((ArrayList) term401437).add(term401389);
        ((ArrayList) term401437).add(term401401);
        ((ArrayList) term401437).add(term401415);
        ((ArrayList) term401437).add(term401431);
        term401364 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListRequest"));
        Object term401365 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term401366 = newInstance(Class.forName("java.time.LocalDate"));
        Object term401370 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term401366, term401366.getClass(), "year", 2012);
        setShortField(term401366, term401366.getClass(), "month", (short) 9);
        setShortField(term401366, term401366.getClass(), "day", (short) 10);
        setField(term401365, term401365.getClass(), "date", term401366);
        setByteField(term401370, term401370.getClass(), "hour", (byte) 15);
        setByteField(term401370, term401370.getClass(), "minute", (byte) 7);
        setByteField(term401370, term401370.getClass(), "second", (byte) 15);
        setIntField(term401370, term401370.getClass(), "nano", 834682604);
        setField(term401365, term401365.getClass(), "time", term401370);
        setField(term401364, term401364.getClass(), "CreationDate", term401365);
        setField(term401364, term401364.getClass(), "Easy", term401375);
        setField(term401364, term401364.getClass(), "Normal", term401421);
        setField(term401364, term401364.getClass(), "Hard", term401425);
        setField(term401364, term401364.getClass(), "Extreme", term401437);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getExtreme", argTypes, term401364, args);
    }

};


