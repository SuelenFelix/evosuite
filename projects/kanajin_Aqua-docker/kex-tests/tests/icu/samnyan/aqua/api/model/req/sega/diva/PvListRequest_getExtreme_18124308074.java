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
     Object term4090650;

    public PvListRequest_getExtreme_18124308074() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term4090663 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        Object term4090667 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        Object term4090668 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        setIntField(term4090663, term4090663.getClass(), "PVID", -635862107);
        setIntField(term4090663, term4090663.getClass(), "Version", 825791886);
        setIntField(term4090663, term4090663.getClass(), "Edition", 1583797350);
        setField(term4090667, term4090667.getClass(), "Start", null);
        setField(term4090667, term4090667.getClass(), "End", null);
        setField(term4090663, term4090663.getClass(), "AdvDemo", term4090667);
        setField(term4090668, term4090668.getClass(), "Start", null);
        setField(term4090668, term4090668.getClass(), "End", null);
        setField(term4090663, term4090663.getClass(), "Playable", term4090668);
        ArrayList term4090661 = new ArrayList();
        ((ArrayList) term4090661).add(term4090663);
        Object term4090673 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        Object term4090677 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        Object term4090678 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        setIntField(term4090673, term4090673.getClass(), "PVID", -1252237469);
        setIntField(term4090673, term4090673.getClass(), "Version", 1880754470);
        setIntField(term4090673, term4090673.getClass(), "Edition", 23556912);
        setField(term4090677, term4090677.getClass(), "Start", null);
        setField(term4090677, term4090677.getClass(), "End", null);
        setField(term4090673, term4090673.getClass(), "AdvDemo", term4090677);
        setField(term4090678, term4090678.getClass(), "Start", null);
        setField(term4090678, term4090678.getClass(), "End", null);
        setField(term4090673, term4090673.getClass(), "Playable", term4090678);
        Object term4090679 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        Object term4090683 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        Object term4090684 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        setIntField(term4090679, term4090679.getClass(), "PVID", -776602825);
        setIntField(term4090679, term4090679.getClass(), "Version", 1412656110);
        setIntField(term4090679, term4090679.getClass(), "Edition", -869568464);
        setField(term4090683, term4090683.getClass(), "Start", null);
        setField(term4090683, term4090683.getClass(), "End", null);
        setField(term4090679, term4090679.getClass(), "AdvDemo", term4090683);
        setField(term4090684, term4090684.getClass(), "Start", null);
        setField(term4090684, term4090684.getClass(), "End", null);
        setField(term4090679, term4090679.getClass(), "Playable", term4090684);
        Object term4090685 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        Object term4090689 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        Object term4090690 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        setIntField(term4090685, term4090685.getClass(), "PVID", 856040957);
        setIntField(term4090685, term4090685.getClass(), "Version", -594978547);
        setIntField(term4090685, term4090685.getClass(), "Edition", 429525314);
        setField(term4090689, term4090689.getClass(), "Start", null);
        setField(term4090689, term4090689.getClass(), "End", null);
        setField(term4090685, term4090685.getClass(), "AdvDemo", term4090689);
        setField(term4090690, term4090690.getClass(), "Start", null);
        setField(term4090690, term4090690.getClass(), "End", null);
        setField(term4090685, term4090685.getClass(), "Playable", term4090690);
        Object term4090691 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        Object term4090695 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        Object term4090696 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        setIntField(term4090691, term4090691.getClass(), "PVID", 909753939);
        setIntField(term4090691, term4090691.getClass(), "Version", 1463110005);
        setIntField(term4090691, term4090691.getClass(), "Edition", -871083460);
        setField(term4090695, term4090695.getClass(), "Start", null);
        setField(term4090695, term4090695.getClass(), "End", null);
        setField(term4090691, term4090691.getClass(), "AdvDemo", term4090695);
        setField(term4090696, term4090696.getClass(), "Start", null);
        setField(term4090696, term4090696.getClass(), "End", null);
        setField(term4090691, term4090691.getClass(), "Playable", term4090696);
        Object term4090697 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        setIntField(term4090697, term4090697.getClass(), "PVID", 929204094);
        setIntField(term4090697, term4090697.getClass(), "Version", 1357762549);
        setIntField(term4090697, term4090697.getClass(), "Edition", 1669623763);
        setField(term4090697, term4090697.getClass(), "AdvDemo", term4090690);
        setField(term4090697, term4090697.getClass(), "Playable", term4090695);
        Object term4090701 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        setIntField(term4090701, term4090701.getClass(), "PVID", -1162164363);
        setIntField(term4090701, term4090701.getClass(), "Version", 754820411);
        setIntField(term4090701, term4090701.getClass(), "Edition", 499599222);
        setField(term4090701, term4090701.getClass(), "AdvDemo", term4090667);
        setField(term4090701, term4090701.getClass(), "Playable", term4090684);
        ArrayList term4090671 = new ArrayList();
        ((ArrayList) term4090671).add(term4090673);
        ((ArrayList) term4090671).add(term4090679);
        ((ArrayList) term4090671).add(term4090685);
        ((ArrayList) term4090671).add(term4090691);
        ((ArrayList) term4090671).add(term4090697);
        ((ArrayList) term4090671).add(term4090701);
        Object term4090709 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        setIntField(term4090709, term4090709.getClass(), "PVID", 1795640414);
        setIntField(term4090709, term4090709.getClass(), "Version", 1066111889);
        setIntField(term4090709, term4090709.getClass(), "Edition", 1951413252);
        setField(term4090709, term4090709.getClass(), "AdvDemo", term4090678);
        setField(term4090709, term4090709.getClass(), "Playable", term4090668);
        Object term4090713 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        setIntField(term4090713, term4090713.getClass(), "PVID", -1195128171);
        setIntField(term4090713, term4090713.getClass(), "Version", 367177470);
        setIntField(term4090713, term4090713.getClass(), "Edition", 1136566669);
        setField(term4090713, term4090713.getClass(), "AdvDemo", term4090668);
        setField(term4090713, term4090713.getClass(), "Playable", term4090696);
        Object term4090717 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        setIntField(term4090717, term4090717.getClass(), "PVID", 1943670788);
        setIntField(term4090717, term4090717.getClass(), "Version", -411946478);
        setIntField(term4090717, term4090717.getClass(), "Edition", -327867119);
        setField(term4090717, term4090717.getClass(), "AdvDemo", term4090690);
        setField(term4090717, term4090717.getClass(), "Playable", term4090690);
        ArrayList term4090707 = new ArrayList();
        ((ArrayList) term4090707).add(term4090709);
        ((ArrayList) term4090707).add(term4090713);
        ((ArrayList) term4090707).add(term4090717);
        ((ArrayList) term4090707).add(term4090691);
        ArrayList term4090723 = new ArrayList();
        ((ArrayList) term4090723).add(term4090717);
        ((ArrayList) term4090723).add(term4090709);
        ((ArrayList) term4090723).add(term4090697);
        term4090650 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListRequest"));
        Object term4090651 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4090652 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4090656 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term4090652, term4090652.getClass(), "year", 2012);
        setShortField(term4090652, term4090652.getClass(), "month", (short) 1);
        setShortField(term4090652, term4090652.getClass(), "day", (short) 9);
        setField(term4090651, term4090651.getClass(), "date", term4090652);
        setByteField(term4090656, term4090656.getClass(), "hour", (byte) 9);
        setByteField(term4090656, term4090656.getClass(), "minute", (byte) 27);
        setByteField(term4090656, term4090656.getClass(), "second", (byte) 12);
        setIntField(term4090656, term4090656.getClass(), "nano", 399080329);
        setField(term4090651, term4090651.getClass(), "time", term4090656);
        setField(term4090650, term4090650.getClass(), "CreationDate", term4090651);
        setField(term4090650, term4090650.getClass(), "Easy", term4090661);
        setField(term4090650, term4090650.getClass(), "Normal", term4090671);
        setField(term4090650, term4090650.getClass(), "Hard", term4090707);
        setField(term4090650, term4090650.getClass(), "Extreme", term4090723);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getExtreme", argTypes, term4090650, args);
    }

};


