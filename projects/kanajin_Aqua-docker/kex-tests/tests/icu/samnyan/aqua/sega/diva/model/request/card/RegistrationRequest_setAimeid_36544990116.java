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
import java.lang.Integer;

public class RegistrationRequest_setAimeid_36544990116 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term239063;
     Object term239419;

    public RegistrationRequest_setAimeid_36544990116() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term239063 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.card.RegistrationRequest"));
        Object term239257 = newInstance(Class.forName("java.time.ZonedDateTime"));
        Object term239258 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term239259 = newInstance(Class.forName("java.time.LocalDate"));
        Object term239263 = newInstance(Class.forName("java.time.LocalTime"));
        Object term239268 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term239278 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term239295 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term239296 = (long[]) newLongArray(1);
        Object[] term239298 = (Object[]) newArray("java.time.ZoneOffset", 2);
        long[] term239299 = (long[]) newLongArray(39);
        Object[] term239339 = (Object[]) newArray("java.time.LocalDateTime", 78);
        Object[] term239340 = (Object[]) newArray("java.time.ZoneOffset", 40);
        Object[] term239341 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term239342 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term239063, term239063.getClass(), "pmm", "MGbwgunHMQ");
        setField(term239063, term239063.getClass(), "idm", "wCgQVdppSI");
        setField(term239063, term239063.getClass(), "mmgameid", "oQWxaFnrYq");
        setField(term239063, term239063.getClass(), "mmuid", "uZcUOSgoMp");
        setField(term239063, term239063.getClass(), "a_code", "eMxNpewLIS");
        setIntField(term239063, term239063.getClass(), "aime_id", -2087196116);
        setField(term239063, term239063.getClass(), "aime_a_code", "GxNdoXawUZ");
        setField(term239063, term239063.getClass(), "key_obj_type", "YAFTYAtere");
        setField(term239063, term239063.getClass(), "player_name", "EYQnrjiZfX");
        setField(term239063, term239063.getClass(), "passwd", "xydFPTvtMs");
        setField(term239063, term239063.getClass(), "cmd", "lopARHjeMT");
        setField(term239063, term239063.getClass(), "req_id", "wizysRLgRr");
        setField(term239063, term239063.getClass(), "game_id", "VbDDltcmiT");
        setField(term239063, term239063.getClass(), "r_ver", "VWIEojCQCj");
        setField(term239063, term239063.getClass(), "kc_serial", "jbeRMWjQTQ");
        setField(term239063, term239063.getClass(), "b_serial", "YOjmohMpFb");
        setField(term239063, term239063.getClass(), "place_id", "WCRWOgfbRC");
        setIntField(term239259, term239259.getClass(), "year", 2022);
        setShortField(term239259, term239259.getClass(), "month", (short) 8);
        setShortField(term239259, term239259.getClass(), "day", (short) 3);
        setField(term239258, term239258.getClass(), "date", term239259);
        setByteField(term239263, term239263.getClass(), "hour", (byte) 18);
        setByteField(term239263, term239263.getClass(), "minute", (byte) 3);
        setByteField(term239263, term239263.getClass(), "second", (byte) 33);
        setIntField(term239263, term239263.getClass(), "nano", 770583920);
        setField(term239258, term239258.getClass(), "time", term239263);
        setField(term239257, term239257.getClass(), "dateTime", term239258);
        setIntField(term239268, term239268.getClass(), "totalSeconds", -10800);
        setField(term239268, term239268.getClass(), "id", "-03:00");
        setField(term239257, term239257.getClass(), "offset", term239268);
        setField(term239278, term239278.getClass(), "id", "America/Recife");
        setLongElement(term239296, 0, -1767217224L);
        setField(term239295, term239295.getClass(), "standardTransitions", term239296);
        setElement(term239298, 1, term239268);
        setField(term239295, term239295.getClass(), "standardOffsets", term239298);
        setLongElement(term239299, 0, -1767217224L);
        setLongElement(term239299, 1, -1206957600L);
        setLongElement(term239299, 2, -1191362400L);
        setLongElement(term239299, 3, -1175374800L);
        setLongElement(term239299, 4, -1159826400L);
        setLongElement(term239299, 5, -633819600L);
        setLongElement(term239299, 6, -622069200L);
        setLongElement(term239299, 7, -602283600L);
        setLongElement(term239299, 8, -591832800L);
        setLongElement(term239299, 9, -570747600L);
        setLongElement(term239299, 10, -560210400L);
        setLongElement(term239299, 11, -539125200L);
        setLongElement(term239299, 12, -531352800L);
        setLongElement(term239299, 13, -191365200L);
        setLongElement(term239299, 14, -184197600L);
        setLongElement(term239299, 15, -155163600L);
        setLongElement(term239299, 16, -150069600L);
        setLongElement(term239299, 17, -128898000L);
        setLongElement(term239299, 18, -121125600L);
        setLongElement(term239299, 19, -99954000L);
        setLongElement(term239299, 20, -89589600L);
        setLongElement(term239299, 21, -68418000L);
        setLongElement(term239299, 22, -57967200L);
        setLongElement(term239299, 23, 499748400L);
        setLongElement(term239299, 24, 511236000L);
        setLongElement(term239299, 25, 530593200L);
        setLongElement(term239299, 26, 540266400L);
        setLongElement(term239299, 27, 562129200L);
        setLongElement(term239299, 28, 571197600L);
        setLongElement(term239299, 29, 592974000L);
        setLongElement(term239299, 30, 602042400L);
        setLongElement(term239299, 31, 624423600L);
        setLongElement(term239299, 32, 634701600L);
        setLongElement(term239299, 33, 938919600L);
        setLongElement(term239299, 34, 951616800L);
        setLongElement(term239299, 35, 970974000L);
        setLongElement(term239299, 36, 971575200L);
        setLongElement(term239299, 37, 1003028400L);
        setLongElement(term239299, 38, 1013911200L);
        setField(term239295, term239295.getClass(), "savingsInstantTransitions", term239299);
        setField(term239295, term239295.getClass(), "savingsLocalTransitions", term239339);
        setElement(term239340, 1, term239268);
        setElement(term239340, 3, term239268);
        setElement(term239340, 5, term239268);
        setElement(term239340, 7, term239268);
        setElement(term239340, 9, term239268);
        setElement(term239340, 11, term239268);
        setElement(term239340, 13, term239268);
        setElement(term239340, 15, term239268);
        setElement(term239340, 17, term239268);
        setElement(term239340, 19, term239268);
        setElement(term239340, 21, term239268);
        setElement(term239340, 23, term239268);
        setElement(term239340, 25, term239268);
        setElement(term239340, 27, term239268);
        setElement(term239340, 29, term239268);
        setElement(term239340, 31, term239268);
        setElement(term239340, 33, term239268);
        setElement(term239340, 35, term239268);
        setElement(term239340, 37, term239268);
        setElement(term239340, 39, term239268);
        setField(term239295, term239295.getClass(), "wallOffsets", term239340);
        setField(term239295, term239295.getClass(), "lastRules", term239341);
        setField(term239342, term239342.getClass(), "table", null);
        setField(term239342, term239342.getClass(), "nextTable", null);
        setLongField(term239342, term239342.getClass(), "baseCount", 0L);
        setIntField(term239342, term239342.getClass(), "sizeCtl", 0);
        setIntField(term239342, term239342.getClass(), "transferIndex", 0);
        setIntField(term239342, term239342.getClass(), "cellsBusy", 0);
        setField(term239342, term239342.getClass(), "counterCells", null);
        setField(term239342, term239342.getClass(), "keySet", null);
        setField(term239342, term239342.getClass(), "values", null);
        setField(term239342, term239342.getClass(), "entrySet", null);
        setField(term239342, term239342.getClass(), "keySet", null);
        setField(term239342, term239342.getClass(), "values", null);
        setField(term239295, term239295.getClass(), "lastRulesCache", term239342);
        setField(term239278, term239278.getClass(), "rules", term239295);
        setField(term239257, term239257.getClass(), "zone", term239278);
        setField(term239063, term239063.getClass(), "time_stamp", term239257);
        setField(term239063, term239063.getClass(), "start_up_mode", "MeiYkUfwEV");
        setField(term239063, term239063.getClass(), "cmm_dly_mod", "YOelMtNboh");
        setField(term239063, term239063.getClass(), "cmm_dly_sec", "ngShbLrxUt");
        setField(term239063, term239063.getClass(), "cmm_err_mod", "tyyoVDzJBp");
        setField(term239063, term239063.getClass(), "country_code", "tbFDmscmBa");
        setField(term239063, term239063.getClass(), "region_code", "iwNiuIUhrn");
        term239419 = new Integer(1836938289);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.card.RegistrationRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term239419;
        callMethod(klass, "setAime_id", argTypes, term239063, args);
    }

};


