package icu.samnyan.aqua.sega.diva.model.request.ingame;

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
import static icu.samnyan.aqua.sega.diva.model.request.ingame.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Integer;

public class BuyModuleRequest_setAcceptidx_15247599516 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term257047;
     Object term257299;

    public BuyModuleRequest_setAcceptidx_15247599516() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term257047 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.ingame.BuyModuleRequest"));
        Object term257137 = newInstance(Class.forName("java.time.ZonedDateTime"));
        Object term257138 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term257139 = newInstance(Class.forName("java.time.LocalDate"));
        Object term257143 = newInstance(Class.forName("java.time.LocalTime"));
        Object term257148 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term257158 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term257175 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term257176 = (long[]) newLongArray(1);
        Object[] term257178 = (Object[]) newArray("java.time.ZoneOffset", 2);
        long[] term257179 = (long[]) newLongArray(39);
        Object[] term257219 = (Object[]) newArray("java.time.LocalDateTime", 78);
        Object[] term257220 = (Object[]) newArray("java.time.ZoneOffset", 40);
        Object[] term257221 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term257222 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setIntField(term257047, term257047.getClass(), "pd_id", 307093558);
        setIntField(term257047, term257047.getClass(), "accept_idx", -1235811707);
        setIntField(term257047, term257047.getClass(), "start_idx", 754505986);
        setIntField(term257047, term257047.getClass(), "mdl_id", 80778317);
        setIntField(term257047, term257047.getClass(), "mdl_price", 1902953758);
        setField(term257047, term257047.getClass(), "cmd", "tYTspNFBci");
        setField(term257047, term257047.getClass(), "req_id", "gPqqqLlWBv");
        setField(term257047, term257047.getClass(), "game_id", "IlWYmbzQQL");
        setField(term257047, term257047.getClass(), "r_ver", "pinoPipukP");
        setField(term257047, term257047.getClass(), "kc_serial", "qqnzeIWFCa");
        setField(term257047, term257047.getClass(), "b_serial", "gOdeBqOhYH");
        setField(term257047, term257047.getClass(), "place_id", "EyPdpJTxkZ");
        setIntField(term257139, term257139.getClass(), "year", 2020);
        setShortField(term257139, term257139.getClass(), "month", (short) 7);
        setShortField(term257139, term257139.getClass(), "day", (short) 24);
        setField(term257138, term257138.getClass(), "date", term257139);
        setByteField(term257143, term257143.getClass(), "hour", (byte) 22);
        setByteField(term257143, term257143.getClass(), "minute", (byte) 16);
        setByteField(term257143, term257143.getClass(), "second", (byte) 59);
        setIntField(term257143, term257143.getClass(), "nano", 588569833);
        setField(term257138, term257138.getClass(), "time", term257143);
        setField(term257137, term257137.getClass(), "dateTime", term257138);
        setIntField(term257148, term257148.getClass(), "totalSeconds", -10800);
        setField(term257148, term257148.getClass(), "id", "-03:00");
        setField(term257137, term257137.getClass(), "offset", term257148);
        setField(term257158, term257158.getClass(), "id", "America/Recife");
        setLongElement(term257176, 0, -1767217224L);
        setField(term257175, term257175.getClass(), "standardTransitions", term257176);
        setElement(term257178, 1, term257148);
        setField(term257175, term257175.getClass(), "standardOffsets", term257178);
        setLongElement(term257179, 0, -1767217224L);
        setLongElement(term257179, 1, -1206957600L);
        setLongElement(term257179, 2, -1191362400L);
        setLongElement(term257179, 3, -1175374800L);
        setLongElement(term257179, 4, -1159826400L);
        setLongElement(term257179, 5, -633819600L);
        setLongElement(term257179, 6, -622069200L);
        setLongElement(term257179, 7, -602283600L);
        setLongElement(term257179, 8, -591832800L);
        setLongElement(term257179, 9, -570747600L);
        setLongElement(term257179, 10, -560210400L);
        setLongElement(term257179, 11, -539125200L);
        setLongElement(term257179, 12, -531352800L);
        setLongElement(term257179, 13, -191365200L);
        setLongElement(term257179, 14, -184197600L);
        setLongElement(term257179, 15, -155163600L);
        setLongElement(term257179, 16, -150069600L);
        setLongElement(term257179, 17, -128898000L);
        setLongElement(term257179, 18, -121125600L);
        setLongElement(term257179, 19, -99954000L);
        setLongElement(term257179, 20, -89589600L);
        setLongElement(term257179, 21, -68418000L);
        setLongElement(term257179, 22, -57967200L);
        setLongElement(term257179, 23, 499748400L);
        setLongElement(term257179, 24, 511236000L);
        setLongElement(term257179, 25, 530593200L);
        setLongElement(term257179, 26, 540266400L);
        setLongElement(term257179, 27, 562129200L);
        setLongElement(term257179, 28, 571197600L);
        setLongElement(term257179, 29, 592974000L);
        setLongElement(term257179, 30, 602042400L);
        setLongElement(term257179, 31, 624423600L);
        setLongElement(term257179, 32, 634701600L);
        setLongElement(term257179, 33, 938919600L);
        setLongElement(term257179, 34, 951616800L);
        setLongElement(term257179, 35, 970974000L);
        setLongElement(term257179, 36, 971575200L);
        setLongElement(term257179, 37, 1003028400L);
        setLongElement(term257179, 38, 1013911200L);
        setField(term257175, term257175.getClass(), "savingsInstantTransitions", term257179);
        setField(term257175, term257175.getClass(), "savingsLocalTransitions", term257219);
        setElement(term257220, 1, term257148);
        setElement(term257220, 3, term257148);
        setElement(term257220, 5, term257148);
        setElement(term257220, 7, term257148);
        setElement(term257220, 9, term257148);
        setElement(term257220, 11, term257148);
        setElement(term257220, 13, term257148);
        setElement(term257220, 15, term257148);
        setElement(term257220, 17, term257148);
        setElement(term257220, 19, term257148);
        setElement(term257220, 21, term257148);
        setElement(term257220, 23, term257148);
        setElement(term257220, 25, term257148);
        setElement(term257220, 27, term257148);
        setElement(term257220, 29, term257148);
        setElement(term257220, 31, term257148);
        setElement(term257220, 33, term257148);
        setElement(term257220, 35, term257148);
        setElement(term257220, 37, term257148);
        setElement(term257220, 39, term257148);
        setField(term257175, term257175.getClass(), "wallOffsets", term257220);
        setField(term257175, term257175.getClass(), "lastRules", term257221);
        setField(term257222, term257222.getClass(), "table", null);
        setField(term257222, term257222.getClass(), "nextTable", null);
        setLongField(term257222, term257222.getClass(), "baseCount", 0L);
        setIntField(term257222, term257222.getClass(), "sizeCtl", 0);
        setIntField(term257222, term257222.getClass(), "transferIndex", 0);
        setIntField(term257222, term257222.getClass(), "cellsBusy", 0);
        setField(term257222, term257222.getClass(), "counterCells", null);
        setField(term257222, term257222.getClass(), "keySet", null);
        setField(term257222, term257222.getClass(), "values", null);
        setField(term257222, term257222.getClass(), "entrySet", null);
        setField(term257222, term257222.getClass(), "keySet", null);
        setField(term257222, term257222.getClass(), "values", null);
        setField(term257175, term257175.getClass(), "lastRulesCache", term257222);
        setField(term257158, term257158.getClass(), "rules", term257175);
        setField(term257137, term257137.getClass(), "zone", term257158);
        setField(term257047, term257047.getClass(), "time_stamp", term257137);
        setField(term257047, term257047.getClass(), "start_up_mode", "vfKOoCcJXS");
        setField(term257047, term257047.getClass(), "cmm_dly_mod", "jCPFInZUzz");
        setField(term257047, term257047.getClass(), "cmm_dly_sec", "WPHeIEBBVh");
        setField(term257047, term257047.getClass(), "cmm_err_mod", "ruFkchQbOS");
        setField(term257047, term257047.getClass(), "country_code", "tBfuxXsdPa");
        setField(term257047, term257047.getClass(), "region_code", "fbUKhQMRyD");
        term257299 = new Integer(1430525569);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.ingame.BuyModuleRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term257299;
        callMethod(klass, "setAccept_idx", argTypes, term257047, args);
    }

};


