package icu.samnyan.aqua.sega.diva.model.request.user;

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
import static icu.samnyan.aqua.sega.diva.model.request.user.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class PreStartRequest_getIdm_19466085651 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10016;

    public PreStartRequest_getIdm_19466085651() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10016 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.user.PreStartRequest"));
        Object term10187 = newInstance(Class.forName("java.time.ZonedDateTime"));
        Object term10188 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term10189 = newInstance(Class.forName("java.time.LocalDate"));
        Object term10193 = newInstance(Class.forName("java.time.LocalTime"));
        Object term10198 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term10208 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term10225 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term10226 = (long[]) newLongArray(1);
        Object[] term10228 = (Object[]) newArray("java.time.ZoneOffset", 2);
        long[] term10229 = (long[]) newLongArray(39);
        Object[] term10269 = (Object[]) newArray("java.time.LocalDateTime", 78);
        Object[] term10270 = (Object[]) newArray("java.time.ZoneOffset", 40);
        Object[] term10271 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term10272 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term10016, term10016.getClass(), "pmm", "NBrvVzvQHe");
        setField(term10016, term10016.getClass(), "idm", "FjOiNAfBOc");
        setField(term10016, term10016.getClass(), "mmgameid", "iCCsaLHohG");
        setField(term10016, term10016.getClass(), "mmuid", "NJhGgctbdj");
        setField(term10016, term10016.getClass(), "a_code", "MYWYUeLGOp");
        setIntField(term10016, term10016.getClass(), "aime_id", 1901317214);
        setField(term10016, term10016.getClass(), "aime_a_code", "tsTGdgQYUL");
        setField(term10016, term10016.getClass(), "key_obj_type", "TtGbVmKcnX");
        setBooleanField(term10016, term10016.getClass(), "exec_vu", false);
        setField(term10016, term10016.getClass(), "cmd", "GJVkUrCVdD");
        setField(term10016, term10016.getClass(), "req_id", "zNdorvdUgu");
        setField(term10016, term10016.getClass(), "game_id", "oPxuZbkYio");
        setField(term10016, term10016.getClass(), "r_ver", "vKitydDVnM");
        setField(term10016, term10016.getClass(), "kc_serial", "urCiQnUFBM");
        setField(term10016, term10016.getClass(), "b_serial", "EKjQdtKxAM");
        setField(term10016, term10016.getClass(), "place_id", "TXZAIPQJHt");
        setIntField(term10189, term10189.getClass(), "year", 2023);
        setShortField(term10189, term10189.getClass(), "month", (short) 3);
        setShortField(term10189, term10189.getClass(), "day", (short) 7);
        setField(term10188, term10188.getClass(), "date", term10189);
        setByteField(term10193, term10193.getClass(), "hour", (byte) 21);
        setByteField(term10193, term10193.getClass(), "minute", (byte) 15);
        setByteField(term10193, term10193.getClass(), "second", (byte) 43);
        setIntField(term10193, term10193.getClass(), "nano", 639721472);
        setField(term10188, term10188.getClass(), "time", term10193);
        setField(term10187, term10187.getClass(), "dateTime", term10188);
        setIntField(term10198, term10198.getClass(), "totalSeconds", -10800);
        setField(term10198, term10198.getClass(), "id", "-03:00");
        setField(term10187, term10187.getClass(), "offset", term10198);
        setField(term10208, term10208.getClass(), "id", "America/Recife");
        setLongElement(term10226, 0, -1767217224L);
        setField(term10225, term10225.getClass(), "standardTransitions", term10226);
        setElement(term10228, 1, term10198);
        setField(term10225, term10225.getClass(), "standardOffsets", term10228);
        setLongElement(term10229, 0, -1767217224L);
        setLongElement(term10229, 1, -1206957600L);
        setLongElement(term10229, 2, -1191362400L);
        setLongElement(term10229, 3, -1175374800L);
        setLongElement(term10229, 4, -1159826400L);
        setLongElement(term10229, 5, -633819600L);
        setLongElement(term10229, 6, -622069200L);
        setLongElement(term10229, 7, -602283600L);
        setLongElement(term10229, 8, -591832800L);
        setLongElement(term10229, 9, -570747600L);
        setLongElement(term10229, 10, -560210400L);
        setLongElement(term10229, 11, -539125200L);
        setLongElement(term10229, 12, -531352800L);
        setLongElement(term10229, 13, -191365200L);
        setLongElement(term10229, 14, -184197600L);
        setLongElement(term10229, 15, -155163600L);
        setLongElement(term10229, 16, -150069600L);
        setLongElement(term10229, 17, -128898000L);
        setLongElement(term10229, 18, -121125600L);
        setLongElement(term10229, 19, -99954000L);
        setLongElement(term10229, 20, -89589600L);
        setLongElement(term10229, 21, -68418000L);
        setLongElement(term10229, 22, -57967200L);
        setLongElement(term10229, 23, 499748400L);
        setLongElement(term10229, 24, 511236000L);
        setLongElement(term10229, 25, 530593200L);
        setLongElement(term10229, 26, 540266400L);
        setLongElement(term10229, 27, 562129200L);
        setLongElement(term10229, 28, 571197600L);
        setLongElement(term10229, 29, 592974000L);
        setLongElement(term10229, 30, 602042400L);
        setLongElement(term10229, 31, 624423600L);
        setLongElement(term10229, 32, 634701600L);
        setLongElement(term10229, 33, 938919600L);
        setLongElement(term10229, 34, 951616800L);
        setLongElement(term10229, 35, 970974000L);
        setLongElement(term10229, 36, 971575200L);
        setLongElement(term10229, 37, 1003028400L);
        setLongElement(term10229, 38, 1013911200L);
        setField(term10225, term10225.getClass(), "savingsInstantTransitions", term10229);
        setField(term10225, term10225.getClass(), "savingsLocalTransitions", term10269);
        setElement(term10270, 1, term10198);
        setElement(term10270, 3, term10198);
        setElement(term10270, 5, term10198);
        setElement(term10270, 7, term10198);
        setElement(term10270, 9, term10198);
        setElement(term10270, 11, term10198);
        setElement(term10270, 13, term10198);
        setElement(term10270, 15, term10198);
        setElement(term10270, 17, term10198);
        setElement(term10270, 19, term10198);
        setElement(term10270, 21, term10198);
        setElement(term10270, 23, term10198);
        setElement(term10270, 25, term10198);
        setElement(term10270, 27, term10198);
        setElement(term10270, 29, term10198);
        setElement(term10270, 31, term10198);
        setElement(term10270, 33, term10198);
        setElement(term10270, 35, term10198);
        setElement(term10270, 37, term10198);
        setElement(term10270, 39, term10198);
        setField(term10225, term10225.getClass(), "wallOffsets", term10270);
        setField(term10225, term10225.getClass(), "lastRules", term10271);
        setField(term10272, term10272.getClass(), "table", null);
        setField(term10272, term10272.getClass(), "nextTable", null);
        setLongField(term10272, term10272.getClass(), "baseCount", 0L);
        setIntField(term10272, term10272.getClass(), "sizeCtl", 0);
        setIntField(term10272, term10272.getClass(), "transferIndex", 0);
        setIntField(term10272, term10272.getClass(), "cellsBusy", 0);
        setField(term10272, term10272.getClass(), "counterCells", null);
        setField(term10272, term10272.getClass(), "keySet", null);
        setField(term10272, term10272.getClass(), "values", null);
        setField(term10272, term10272.getClass(), "entrySet", null);
        setField(term10272, term10272.getClass(), "keySet", null);
        setField(term10272, term10272.getClass(), "values", null);
        setField(term10225, term10225.getClass(), "lastRulesCache", term10272);
        setField(term10208, term10208.getClass(), "rules", term10225);
        setField(term10187, term10187.getClass(), "zone", term10208);
        setField(term10016, term10016.getClass(), "time_stamp", term10187);
        setField(term10016, term10016.getClass(), "start_up_mode", "DIbeDHICho");
        setField(term10016, term10016.getClass(), "cmm_dly_mod", "dJGPlmSRnz");
        setField(term10016, term10016.getClass(), "cmm_dly_sec", "DPskuFUobI");
        setField(term10016, term10016.getClass(), "cmm_err_mod", "wBGfLpNNiZ");
        setField(term10016, term10016.getClass(), "country_code", "yUGCjlqgJE");
        setField(term10016, term10016.getClass(), "region_code", "PXdVZyoJyC");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.user.PreStartRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getIdm", argTypes, term10016, args);
    }

};


