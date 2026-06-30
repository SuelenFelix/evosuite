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

public class BuyModuleRequest_getMdlprice_9253436764 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term256161;

    public BuyModuleRequest_getMdlprice_9253436764() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term256161 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.ingame.BuyModuleRequest"));
        Object term256251 = newInstance(Class.forName("java.time.ZonedDateTime"));
        Object term256252 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term256253 = newInstance(Class.forName("java.time.LocalDate"));
        Object term256257 = newInstance(Class.forName("java.time.LocalTime"));
        Object term256262 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term256272 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term256289 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term256290 = (long[]) newLongArray(1);
        Object[] term256292 = (Object[]) newArray("java.time.ZoneOffset", 2);
        long[] term256293 = (long[]) newLongArray(39);
        Object[] term256333 = (Object[]) newArray("java.time.LocalDateTime", 78);
        Object[] term256334 = (Object[]) newArray("java.time.ZoneOffset", 40);
        Object[] term256335 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term256336 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setIntField(term256161, term256161.getClass(), "pd_id", -1251474726);
        setIntField(term256161, term256161.getClass(), "accept_idx", -1850930692);
        setIntField(term256161, term256161.getClass(), "start_idx", 2119675963);
        setIntField(term256161, term256161.getClass(), "mdl_id", -1856068876);
        setIntField(term256161, term256161.getClass(), "mdl_price", -2124862312);
        setField(term256161, term256161.getClass(), "cmd", "uencoVszfi");
        setField(term256161, term256161.getClass(), "req_id", "PfneRKTZrA");
        setField(term256161, term256161.getClass(), "game_id", "LTQEgDpWsr");
        setField(term256161, term256161.getClass(), "r_ver", "SzvLbLIVwG");
        setField(term256161, term256161.getClass(), "kc_serial", "mKnmYOhILq");
        setField(term256161, term256161.getClass(), "b_serial", "YXXfMygQcG");
        setField(term256161, term256161.getClass(), "place_id", "sQAHuaiApa");
        setIntField(term256253, term256253.getClass(), "year", 2019);
        setShortField(term256253, term256253.getClass(), "month", (short) 9);
        setShortField(term256253, term256253.getClass(), "day", (short) 3);
        setField(term256252, term256252.getClass(), "date", term256253);
        setByteField(term256257, term256257.getClass(), "hour", (byte) 2);
        setByteField(term256257, term256257.getClass(), "minute", (byte) 32);
        setByteField(term256257, term256257.getClass(), "second", (byte) 30);
        setIntField(term256257, term256257.getClass(), "nano", 339846128);
        setField(term256252, term256252.getClass(), "time", term256257);
        setField(term256251, term256251.getClass(), "dateTime", term256252);
        setIntField(term256262, term256262.getClass(), "totalSeconds", -10800);
        setField(term256262, term256262.getClass(), "id", "-03:00");
        setField(term256251, term256251.getClass(), "offset", term256262);
        setField(term256272, term256272.getClass(), "id", "America/Recife");
        setLongElement(term256290, 0, -1767217224L);
        setField(term256289, term256289.getClass(), "standardTransitions", term256290);
        setElement(term256292, 1, term256262);
        setField(term256289, term256289.getClass(), "standardOffsets", term256292);
        setLongElement(term256293, 0, -1767217224L);
        setLongElement(term256293, 1, -1206957600L);
        setLongElement(term256293, 2, -1191362400L);
        setLongElement(term256293, 3, -1175374800L);
        setLongElement(term256293, 4, -1159826400L);
        setLongElement(term256293, 5, -633819600L);
        setLongElement(term256293, 6, -622069200L);
        setLongElement(term256293, 7, -602283600L);
        setLongElement(term256293, 8, -591832800L);
        setLongElement(term256293, 9, -570747600L);
        setLongElement(term256293, 10, -560210400L);
        setLongElement(term256293, 11, -539125200L);
        setLongElement(term256293, 12, -531352800L);
        setLongElement(term256293, 13, -191365200L);
        setLongElement(term256293, 14, -184197600L);
        setLongElement(term256293, 15, -155163600L);
        setLongElement(term256293, 16, -150069600L);
        setLongElement(term256293, 17, -128898000L);
        setLongElement(term256293, 18, -121125600L);
        setLongElement(term256293, 19, -99954000L);
        setLongElement(term256293, 20, -89589600L);
        setLongElement(term256293, 21, -68418000L);
        setLongElement(term256293, 22, -57967200L);
        setLongElement(term256293, 23, 499748400L);
        setLongElement(term256293, 24, 511236000L);
        setLongElement(term256293, 25, 530593200L);
        setLongElement(term256293, 26, 540266400L);
        setLongElement(term256293, 27, 562129200L);
        setLongElement(term256293, 28, 571197600L);
        setLongElement(term256293, 29, 592974000L);
        setLongElement(term256293, 30, 602042400L);
        setLongElement(term256293, 31, 624423600L);
        setLongElement(term256293, 32, 634701600L);
        setLongElement(term256293, 33, 938919600L);
        setLongElement(term256293, 34, 951616800L);
        setLongElement(term256293, 35, 970974000L);
        setLongElement(term256293, 36, 971575200L);
        setLongElement(term256293, 37, 1003028400L);
        setLongElement(term256293, 38, 1013911200L);
        setField(term256289, term256289.getClass(), "savingsInstantTransitions", term256293);
        setField(term256289, term256289.getClass(), "savingsLocalTransitions", term256333);
        setElement(term256334, 1, term256262);
        setElement(term256334, 3, term256262);
        setElement(term256334, 5, term256262);
        setElement(term256334, 7, term256262);
        setElement(term256334, 9, term256262);
        setElement(term256334, 11, term256262);
        setElement(term256334, 13, term256262);
        setElement(term256334, 15, term256262);
        setElement(term256334, 17, term256262);
        setElement(term256334, 19, term256262);
        setElement(term256334, 21, term256262);
        setElement(term256334, 23, term256262);
        setElement(term256334, 25, term256262);
        setElement(term256334, 27, term256262);
        setElement(term256334, 29, term256262);
        setElement(term256334, 31, term256262);
        setElement(term256334, 33, term256262);
        setElement(term256334, 35, term256262);
        setElement(term256334, 37, term256262);
        setElement(term256334, 39, term256262);
        setField(term256289, term256289.getClass(), "wallOffsets", term256334);
        setField(term256289, term256289.getClass(), "lastRules", term256335);
        setField(term256336, term256336.getClass(), "table", null);
        setField(term256336, term256336.getClass(), "nextTable", null);
        setLongField(term256336, term256336.getClass(), "baseCount", 0L);
        setIntField(term256336, term256336.getClass(), "sizeCtl", 0);
        setIntField(term256336, term256336.getClass(), "transferIndex", 0);
        setIntField(term256336, term256336.getClass(), "cellsBusy", 0);
        setField(term256336, term256336.getClass(), "counterCells", null);
        setField(term256336, term256336.getClass(), "keySet", null);
        setField(term256336, term256336.getClass(), "values", null);
        setField(term256336, term256336.getClass(), "entrySet", null);
        setField(term256336, term256336.getClass(), "keySet", null);
        setField(term256336, term256336.getClass(), "values", null);
        setField(term256289, term256289.getClass(), "lastRulesCache", term256336);
        setField(term256272, term256272.getClass(), "rules", term256289);
        setField(term256251, term256251.getClass(), "zone", term256272);
        setField(term256161, term256161.getClass(), "time_stamp", term256251);
        setField(term256161, term256161.getClass(), "start_up_mode", "xDMxegGKqV");
        setField(term256161, term256161.getClass(), "cmm_dly_mod", "zPKOGLLGZN");
        setField(term256161, term256161.getClass(), "cmm_dly_sec", "lajHHsoSDZ");
        setField(term256161, term256161.getClass(), "cmm_err_mod", "YdUxGeeDjc");
        setField(term256161, term256161.getClass(), "country_code", "TbgzoLhCKy");
        setField(term256161, term256161.getClass(), "region_code", "MXAuemWmBo");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.ingame.BuyModuleRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMdl_price", argTypes, term256161, args);
    }

};


