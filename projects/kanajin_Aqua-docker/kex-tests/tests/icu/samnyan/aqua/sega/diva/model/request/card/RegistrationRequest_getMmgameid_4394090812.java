package icu.samnyan.aqua.sega.diva.model.request.card;

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
import static icu.samnyan.aqua.sega.diva.model.request.card.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class RegistrationRequest_getMmgameid_4394090812 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7549;

    public RegistrationRequest_getMmgameid_4394090812() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7549 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.card.RegistrationRequest"));
        Object term7743 = newInstance(Class.forName("java.time.ZonedDateTime"));
        Object term7744 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term7745 = newInstance(Class.forName("java.time.LocalDate"));
        Object term7749 = newInstance(Class.forName("java.time.LocalTime"));
        Object term7754 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term7764 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term7781 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term7782 = (long[]) newLongArray(1);
        Object[] term7784 = (Object[]) newArray("java.time.ZoneOffset", 2);
        long[] term7785 = (long[]) newLongArray(39);
        Object[] term7825 = (Object[]) newArray("java.time.LocalDateTime", 78);
        Object[] term7826 = (Object[]) newArray("java.time.ZoneOffset", 40);
        Object[] term7827 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term7828 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term7549, term7549.getClass(), "pmm", "WBAOTqErtm");
        setField(term7549, term7549.getClass(), "idm", "PqtVXXZMqK");
        setField(term7549, term7549.getClass(), "mmgameid", "rYbtIDVdnd");
        setField(term7549, term7549.getClass(), "mmuid", "UKAReurpHG");
        setField(term7549, term7549.getClass(), "a_code", "WVRMUmrljA");
        setIntField(term7549, term7549.getClass(), "aime_id", 1876565163);
        setField(term7549, term7549.getClass(), "aime_a_code", "NTlKJDDWlk");
        setField(term7549, term7549.getClass(), "key_obj_type", "vOuMEpOQAg");
        setField(term7549, term7549.getClass(), "player_name", "SIODFGaQhr");
        setField(term7549, term7549.getClass(), "passwd", "qYzsiuXOgS");
        setField(term7549, term7549.getClass(), "cmd", "bxrCBbrrct");
        setField(term7549, term7549.getClass(), "req_id", "CKWpJaaaxX");
        setField(term7549, term7549.getClass(), "game_id", "UBRmXJmfrt");
        setField(term7549, term7549.getClass(), "r_ver", "WZzvmIHhzZ");
        setField(term7549, term7549.getClass(), "kc_serial", "doQLHkjpNm");
        setField(term7549, term7549.getClass(), "b_serial", "lCyLIcSuom");
        setField(term7549, term7549.getClass(), "place_id", "CGOpQSZZwI");
        setIntField(term7745, term7745.getClass(), "year", 2012);
        setShortField(term7745, term7745.getClass(), "month", (short) 2);
        setShortField(term7745, term7745.getClass(), "day", (short) 19);
        setField(term7744, term7744.getClass(), "date", term7745);
        setByteField(term7749, term7749.getClass(), "hour", (byte) 8);
        setByteField(term7749, term7749.getClass(), "minute", (byte) 4);
        setByteField(term7749, term7749.getClass(), "second", (byte) 43);
        setIntField(term7749, term7749.getClass(), "nano", 114930008);
        setField(term7744, term7744.getClass(), "time", term7749);
        setField(term7743, term7743.getClass(), "dateTime", term7744);
        setIntField(term7754, term7754.getClass(), "totalSeconds", -10800);
        setField(term7754, term7754.getClass(), "id", "-03:00");
        setField(term7743, term7743.getClass(), "offset", term7754);
        setField(term7764, term7764.getClass(), "id", "America/Recife");
        setLongElement(term7782, 0, -1767217224L);
        setField(term7781, term7781.getClass(), "standardTransitions", term7782);
        setElement(term7784, 1, term7754);
        setField(term7781, term7781.getClass(), "standardOffsets", term7784);
        setLongElement(term7785, 0, -1767217224L);
        setLongElement(term7785, 1, -1206957600L);
        setLongElement(term7785, 2, -1191362400L);
        setLongElement(term7785, 3, -1175374800L);
        setLongElement(term7785, 4, -1159826400L);
        setLongElement(term7785, 5, -633819600L);
        setLongElement(term7785, 6, -622069200L);
        setLongElement(term7785, 7, -602283600L);
        setLongElement(term7785, 8, -591832800L);
        setLongElement(term7785, 9, -570747600L);
        setLongElement(term7785, 10, -560210400L);
        setLongElement(term7785, 11, -539125200L);
        setLongElement(term7785, 12, -531352800L);
        setLongElement(term7785, 13, -191365200L);
        setLongElement(term7785, 14, -184197600L);
        setLongElement(term7785, 15, -155163600L);
        setLongElement(term7785, 16, -150069600L);
        setLongElement(term7785, 17, -128898000L);
        setLongElement(term7785, 18, -121125600L);
        setLongElement(term7785, 19, -99954000L);
        setLongElement(term7785, 20, -89589600L);
        setLongElement(term7785, 21, -68418000L);
        setLongElement(term7785, 22, -57967200L);
        setLongElement(term7785, 23, 499748400L);
        setLongElement(term7785, 24, 511236000L);
        setLongElement(term7785, 25, 530593200L);
        setLongElement(term7785, 26, 540266400L);
        setLongElement(term7785, 27, 562129200L);
        setLongElement(term7785, 28, 571197600L);
        setLongElement(term7785, 29, 592974000L);
        setLongElement(term7785, 30, 602042400L);
        setLongElement(term7785, 31, 624423600L);
        setLongElement(term7785, 32, 634701600L);
        setLongElement(term7785, 33, 938919600L);
        setLongElement(term7785, 34, 951616800L);
        setLongElement(term7785, 35, 970974000L);
        setLongElement(term7785, 36, 971575200L);
        setLongElement(term7785, 37, 1003028400L);
        setLongElement(term7785, 38, 1013911200L);
        setField(term7781, term7781.getClass(), "savingsInstantTransitions", term7785);
        setField(term7781, term7781.getClass(), "savingsLocalTransitions", term7825);
        setElement(term7826, 1, term7754);
        setElement(term7826, 3, term7754);
        setElement(term7826, 5, term7754);
        setElement(term7826, 7, term7754);
        setElement(term7826, 9, term7754);
        setElement(term7826, 11, term7754);
        setElement(term7826, 13, term7754);
        setElement(term7826, 15, term7754);
        setElement(term7826, 17, term7754);
        setElement(term7826, 19, term7754);
        setElement(term7826, 21, term7754);
        setElement(term7826, 23, term7754);
        setElement(term7826, 25, term7754);
        setElement(term7826, 27, term7754);
        setElement(term7826, 29, term7754);
        setElement(term7826, 31, term7754);
        setElement(term7826, 33, term7754);
        setElement(term7826, 35, term7754);
        setElement(term7826, 37, term7754);
        setElement(term7826, 39, term7754);
        setField(term7781, term7781.getClass(), "wallOffsets", term7826);
        setField(term7781, term7781.getClass(), "lastRules", term7827);
        setField(term7828, term7828.getClass(), "table", null);
        setField(term7828, term7828.getClass(), "nextTable", null);
        setLongField(term7828, term7828.getClass(), "baseCount", 0L);
        setIntField(term7828, term7828.getClass(), "sizeCtl", 0);
        setIntField(term7828, term7828.getClass(), "transferIndex", 0);
        setIntField(term7828, term7828.getClass(), "cellsBusy", 0);
        setField(term7828, term7828.getClass(), "counterCells", null);
        setField(term7828, term7828.getClass(), "keySet", null);
        setField(term7828, term7828.getClass(), "values", null);
        setField(term7828, term7828.getClass(), "entrySet", null);
        setField(term7828, term7828.getClass(), "keySet", null);
        setField(term7828, term7828.getClass(), "values", null);
        setField(term7781, term7781.getClass(), "lastRulesCache", term7828);
        setField(term7764, term7764.getClass(), "rules", term7781);
        setField(term7743, term7743.getClass(), "zone", term7764);
        setField(term7549, term7549.getClass(), "time_stamp", term7743);
        setField(term7549, term7549.getClass(), "start_up_mode", "ypEdrstygY");
        setField(term7549, term7549.getClass(), "cmm_dly_mod", "sNQFlATEeQ");
        setField(term7549, term7549.getClass(), "cmm_dly_sec", "ZKMLioamsY");
        setField(term7549, term7549.getClass(), "cmm_err_mod", "WVbxuoDBcn");
        setField(term7549, term7549.getClass(), "country_code", "pvDEABOxLt");
        setField(term7549, term7549.getClass(), "region_code", "beAMpkroCQ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.card.RegistrationRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMmgameid", argTypes, term7549, args);
    }

};


