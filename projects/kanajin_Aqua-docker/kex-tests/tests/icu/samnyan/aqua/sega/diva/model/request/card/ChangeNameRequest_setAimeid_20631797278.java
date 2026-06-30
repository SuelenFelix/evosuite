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

public class ChangeNameRequest_setAimeid_20631797278 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27511;
     Object term27798;

    public ChangeNameRequest_setAimeid_20631797278() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27511 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.card.ChangeNameRequest"));
        Object term27636 = newInstance(Class.forName("java.time.ZonedDateTime"));
        Object term27637 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term27638 = newInstance(Class.forName("java.time.LocalDate"));
        Object term27642 = newInstance(Class.forName("java.time.LocalTime"));
        Object term27647 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term27657 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term27674 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term27675 = (long[]) newLongArray(1);
        Object[] term27677 = (Object[]) newArray("java.time.ZoneOffset", 2);
        long[] term27678 = (long[]) newLongArray(39);
        Object[] term27718 = (Object[]) newArray("java.time.LocalDateTime", 78);
        Object[] term27719 = (Object[]) newArray("java.time.ZoneOffset", 40);
        Object[] term27720 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term27721 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term27511, term27511.getClass(), "a_code", "lzcwhvjdFg");
        setIntField(term27511, term27511.getClass(), "aime_id", -893623680);
        setField(term27511, term27511.getClass(), "aime_a_code", "dfzWTjcjnI");
        setIntField(term27511, term27511.getClass(), "pd_id", -1963434938);
        setIntField(term27511, term27511.getClass(), "accept_idx", 906181092);
        setField(term27511, term27511.getClass(), "player_name", "bsnZXGEvFv");
        setIntField(term27511, term27511.getClass(), "chg_name_price", 1045657203);
        setField(term27511, term27511.getClass(), "cmd", "osFrHWYeRy");
        setField(term27511, term27511.getClass(), "req_id", "scpIQUfPKw");
        setField(term27511, term27511.getClass(), "game_id", "QKYBpCjuYt");
        setField(term27511, term27511.getClass(), "r_ver", "vjiRfoGdkl");
        setField(term27511, term27511.getClass(), "kc_serial", "TwaxeSHvnR");
        setField(term27511, term27511.getClass(), "b_serial", "paPzDETzIq");
        setField(term27511, term27511.getClass(), "place_id", "fufeuGfwpN");
        setIntField(term27638, term27638.getClass(), "year", 2012);
        setShortField(term27638, term27638.getClass(), "month", (short) 4);
        setShortField(term27638, term27638.getClass(), "day", (short) 25);
        setField(term27637, term27637.getClass(), "date", term27638);
        setByteField(term27642, term27642.getClass(), "hour", (byte) 21);
        setByteField(term27642, term27642.getClass(), "minute", (byte) 14);
        setByteField(term27642, term27642.getClass(), "second", (byte) 15);
        setIntField(term27642, term27642.getClass(), "nano", 561700934);
        setField(term27637, term27637.getClass(), "time", term27642);
        setField(term27636, term27636.getClass(), "dateTime", term27637);
        setIntField(term27647, term27647.getClass(), "totalSeconds", -10800);
        setField(term27647, term27647.getClass(), "id", "-03:00");
        setField(term27636, term27636.getClass(), "offset", term27647);
        setField(term27657, term27657.getClass(), "id", "America/Recife");
        setLongElement(term27675, 0, -1767217224L);
        setField(term27674, term27674.getClass(), "standardTransitions", term27675);
        setElement(term27677, 1, term27647);
        setField(term27674, term27674.getClass(), "standardOffsets", term27677);
        setLongElement(term27678, 0, -1767217224L);
        setLongElement(term27678, 1, -1206957600L);
        setLongElement(term27678, 2, -1191362400L);
        setLongElement(term27678, 3, -1175374800L);
        setLongElement(term27678, 4, -1159826400L);
        setLongElement(term27678, 5, -633819600L);
        setLongElement(term27678, 6, -622069200L);
        setLongElement(term27678, 7, -602283600L);
        setLongElement(term27678, 8, -591832800L);
        setLongElement(term27678, 9, -570747600L);
        setLongElement(term27678, 10, -560210400L);
        setLongElement(term27678, 11, -539125200L);
        setLongElement(term27678, 12, -531352800L);
        setLongElement(term27678, 13, -191365200L);
        setLongElement(term27678, 14, -184197600L);
        setLongElement(term27678, 15, -155163600L);
        setLongElement(term27678, 16, -150069600L);
        setLongElement(term27678, 17, -128898000L);
        setLongElement(term27678, 18, -121125600L);
        setLongElement(term27678, 19, -99954000L);
        setLongElement(term27678, 20, -89589600L);
        setLongElement(term27678, 21, -68418000L);
        setLongElement(term27678, 22, -57967200L);
        setLongElement(term27678, 23, 499748400L);
        setLongElement(term27678, 24, 511236000L);
        setLongElement(term27678, 25, 530593200L);
        setLongElement(term27678, 26, 540266400L);
        setLongElement(term27678, 27, 562129200L);
        setLongElement(term27678, 28, 571197600L);
        setLongElement(term27678, 29, 592974000L);
        setLongElement(term27678, 30, 602042400L);
        setLongElement(term27678, 31, 624423600L);
        setLongElement(term27678, 32, 634701600L);
        setLongElement(term27678, 33, 938919600L);
        setLongElement(term27678, 34, 951616800L);
        setLongElement(term27678, 35, 970974000L);
        setLongElement(term27678, 36, 971575200L);
        setLongElement(term27678, 37, 1003028400L);
        setLongElement(term27678, 38, 1013911200L);
        setField(term27674, term27674.getClass(), "savingsInstantTransitions", term27678);
        setField(term27674, term27674.getClass(), "savingsLocalTransitions", term27718);
        setElement(term27719, 1, term27647);
        setElement(term27719, 3, term27647);
        setElement(term27719, 5, term27647);
        setElement(term27719, 7, term27647);
        setElement(term27719, 9, term27647);
        setElement(term27719, 11, term27647);
        setElement(term27719, 13, term27647);
        setElement(term27719, 15, term27647);
        setElement(term27719, 17, term27647);
        setElement(term27719, 19, term27647);
        setElement(term27719, 21, term27647);
        setElement(term27719, 23, term27647);
        setElement(term27719, 25, term27647);
        setElement(term27719, 27, term27647);
        setElement(term27719, 29, term27647);
        setElement(term27719, 31, term27647);
        setElement(term27719, 33, term27647);
        setElement(term27719, 35, term27647);
        setElement(term27719, 37, term27647);
        setElement(term27719, 39, term27647);
        setField(term27674, term27674.getClass(), "wallOffsets", term27719);
        setField(term27674, term27674.getClass(), "lastRules", term27720);
        setField(term27721, term27721.getClass(), "table", null);
        setField(term27721, term27721.getClass(), "nextTable", null);
        setLongField(term27721, term27721.getClass(), "baseCount", 0L);
        setIntField(term27721, term27721.getClass(), "sizeCtl", 0);
        setIntField(term27721, term27721.getClass(), "transferIndex", 0);
        setIntField(term27721, term27721.getClass(), "cellsBusy", 0);
        setField(term27721, term27721.getClass(), "counterCells", null);
        setField(term27721, term27721.getClass(), "keySet", null);
        setField(term27721, term27721.getClass(), "values", null);
        setField(term27721, term27721.getClass(), "entrySet", null);
        setField(term27721, term27721.getClass(), "keySet", null);
        setField(term27721, term27721.getClass(), "values", null);
        setField(term27674, term27674.getClass(), "lastRulesCache", term27721);
        setField(term27657, term27657.getClass(), "rules", term27674);
        setField(term27636, term27636.getClass(), "zone", term27657);
        setField(term27511, term27511.getClass(), "time_stamp", term27636);
        setField(term27511, term27511.getClass(), "start_up_mode", "XJbkXbljvz");
        setField(term27511, term27511.getClass(), "cmm_dly_mod", "fuvdkDwBeH");
        setField(term27511, term27511.getClass(), "cmm_dly_sec", "NTefzwLPhx");
        setField(term27511, term27511.getClass(), "cmm_err_mod", "dirFuhqyNu");
        setField(term27511, term27511.getClass(), "country_code", "YVLRenzuoR");
        setField(term27511, term27511.getClass(), "region_code", "JukEMhPWql");
        term27798 = new Integer(1386130016);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.card.ChangeNameRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term27798;
        callMethod(klass, "setAime_id", argTypes, term27511, args);
    }

};


