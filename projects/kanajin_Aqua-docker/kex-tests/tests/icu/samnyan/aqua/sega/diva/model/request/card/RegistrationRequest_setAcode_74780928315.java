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

public class RegistrationRequest_setAcode_74780928315 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term238405;

    public RegistrationRequest_setAcode_74780928315() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term238405 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.card.RegistrationRequest"));
        Object term238599 = newInstance(Class.forName("java.time.ZonedDateTime"));
        Object term238600 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term238601 = newInstance(Class.forName("java.time.LocalDate"));
        Object term238605 = newInstance(Class.forName("java.time.LocalTime"));
        Object term238610 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term238620 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term238637 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term238638 = (long[]) newLongArray(1);
        Object[] term238640 = (Object[]) newArray("java.time.ZoneOffset", 2);
        long[] term238641 = (long[]) newLongArray(39);
        Object[] term238681 = (Object[]) newArray("java.time.LocalDateTime", 78);
        Object[] term238682 = (Object[]) newArray("java.time.ZoneOffset", 40);
        Object[] term238683 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term238684 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term238405, term238405.getClass(), "pmm", "mOILNTkENv");
        setField(term238405, term238405.getClass(), "idm", "xgjvpKAqFv");
        setField(term238405, term238405.getClass(), "mmgameid", "RspkCWCAFM");
        setField(term238405, term238405.getClass(), "mmuid", "zAkmDkobmH");
        setField(term238405, term238405.getClass(), "a_code", "FASdrZqBfN");
        setIntField(term238405, term238405.getClass(), "aime_id", -1951631721);
        setField(term238405, term238405.getClass(), "aime_a_code", "YNwqJgOcWq");
        setField(term238405, term238405.getClass(), "key_obj_type", "tUcoJjDoJV");
        setField(term238405, term238405.getClass(), "player_name", "ICNsClDoAn");
        setField(term238405, term238405.getClass(), "passwd", "LACfLkaJjq");
        setField(term238405, term238405.getClass(), "cmd", "OhYEjeUQkK");
        setField(term238405, term238405.getClass(), "req_id", "rgZeldfAMO");
        setField(term238405, term238405.getClass(), "game_id", "btsBDylBZe");
        setField(term238405, term238405.getClass(), "r_ver", "eAWJddaxnT");
        setField(term238405, term238405.getClass(), "kc_serial", "PyaMftIAzC");
        setField(term238405, term238405.getClass(), "b_serial", "QiSmNdQUzl");
        setField(term238405, term238405.getClass(), "place_id", "FsjVOWFhLi");
        setIntField(term238601, term238601.getClass(), "year", 2023);
        setShortField(term238601, term238601.getClass(), "month", (short) 5);
        setShortField(term238601, term238601.getClass(), "day", (short) 19);
        setField(term238600, term238600.getClass(), "date", term238601);
        setByteField(term238605, term238605.getClass(), "hour", (byte) 20);
        setByteField(term238605, term238605.getClass(), "minute", (byte) 50);
        setByteField(term238605, term238605.getClass(), "second", (byte) 49);
        setIntField(term238605, term238605.getClass(), "nano", 806710892);
        setField(term238600, term238600.getClass(), "time", term238605);
        setField(term238599, term238599.getClass(), "dateTime", term238600);
        setIntField(term238610, term238610.getClass(), "totalSeconds", -10800);
        setField(term238610, term238610.getClass(), "id", "-03:00");
        setField(term238599, term238599.getClass(), "offset", term238610);
        setField(term238620, term238620.getClass(), "id", "America/Recife");
        setLongElement(term238638, 0, -1767217224L);
        setField(term238637, term238637.getClass(), "standardTransitions", term238638);
        setElement(term238640, 1, term238610);
        setField(term238637, term238637.getClass(), "standardOffsets", term238640);
        setLongElement(term238641, 0, -1767217224L);
        setLongElement(term238641, 1, -1206957600L);
        setLongElement(term238641, 2, -1191362400L);
        setLongElement(term238641, 3, -1175374800L);
        setLongElement(term238641, 4, -1159826400L);
        setLongElement(term238641, 5, -633819600L);
        setLongElement(term238641, 6, -622069200L);
        setLongElement(term238641, 7, -602283600L);
        setLongElement(term238641, 8, -591832800L);
        setLongElement(term238641, 9, -570747600L);
        setLongElement(term238641, 10, -560210400L);
        setLongElement(term238641, 11, -539125200L);
        setLongElement(term238641, 12, -531352800L);
        setLongElement(term238641, 13, -191365200L);
        setLongElement(term238641, 14, -184197600L);
        setLongElement(term238641, 15, -155163600L);
        setLongElement(term238641, 16, -150069600L);
        setLongElement(term238641, 17, -128898000L);
        setLongElement(term238641, 18, -121125600L);
        setLongElement(term238641, 19, -99954000L);
        setLongElement(term238641, 20, -89589600L);
        setLongElement(term238641, 21, -68418000L);
        setLongElement(term238641, 22, -57967200L);
        setLongElement(term238641, 23, 499748400L);
        setLongElement(term238641, 24, 511236000L);
        setLongElement(term238641, 25, 530593200L);
        setLongElement(term238641, 26, 540266400L);
        setLongElement(term238641, 27, 562129200L);
        setLongElement(term238641, 28, 571197600L);
        setLongElement(term238641, 29, 592974000L);
        setLongElement(term238641, 30, 602042400L);
        setLongElement(term238641, 31, 624423600L);
        setLongElement(term238641, 32, 634701600L);
        setLongElement(term238641, 33, 938919600L);
        setLongElement(term238641, 34, 951616800L);
        setLongElement(term238641, 35, 970974000L);
        setLongElement(term238641, 36, 971575200L);
        setLongElement(term238641, 37, 1003028400L);
        setLongElement(term238641, 38, 1013911200L);
        setField(term238637, term238637.getClass(), "savingsInstantTransitions", term238641);
        setField(term238637, term238637.getClass(), "savingsLocalTransitions", term238681);
        setElement(term238682, 1, term238610);
        setElement(term238682, 3, term238610);
        setElement(term238682, 5, term238610);
        setElement(term238682, 7, term238610);
        setElement(term238682, 9, term238610);
        setElement(term238682, 11, term238610);
        setElement(term238682, 13, term238610);
        setElement(term238682, 15, term238610);
        setElement(term238682, 17, term238610);
        setElement(term238682, 19, term238610);
        setElement(term238682, 21, term238610);
        setElement(term238682, 23, term238610);
        setElement(term238682, 25, term238610);
        setElement(term238682, 27, term238610);
        setElement(term238682, 29, term238610);
        setElement(term238682, 31, term238610);
        setElement(term238682, 33, term238610);
        setElement(term238682, 35, term238610);
        setElement(term238682, 37, term238610);
        setElement(term238682, 39, term238610);
        setField(term238637, term238637.getClass(), "wallOffsets", term238682);
        setField(term238637, term238637.getClass(), "lastRules", term238683);
        setField(term238684, term238684.getClass(), "table", null);
        setField(term238684, term238684.getClass(), "nextTable", null);
        setLongField(term238684, term238684.getClass(), "baseCount", 0L);
        setIntField(term238684, term238684.getClass(), "sizeCtl", 0);
        setIntField(term238684, term238684.getClass(), "transferIndex", 0);
        setIntField(term238684, term238684.getClass(), "cellsBusy", 0);
        setField(term238684, term238684.getClass(), "counterCells", null);
        setField(term238684, term238684.getClass(), "keySet", null);
        setField(term238684, term238684.getClass(), "values", null);
        setField(term238684, term238684.getClass(), "entrySet", null);
        setField(term238684, term238684.getClass(), "keySet", null);
        setField(term238684, term238684.getClass(), "values", null);
        setField(term238637, term238637.getClass(), "lastRulesCache", term238684);
        setField(term238620, term238620.getClass(), "rules", term238637);
        setField(term238599, term238599.getClass(), "zone", term238620);
        setField(term238405, term238405.getClass(), "time_stamp", term238599);
        setField(term238405, term238405.getClass(), "start_up_mode", "RReQXZQnIR");
        setField(term238405, term238405.getClass(), "cmm_dly_mod", "VnHgyPgIAn");
        setField(term238405, term238405.getClass(), "cmm_dly_sec", "EIkLuLTIDO");
        setField(term238405, term238405.getClass(), "cmm_err_mod", "rQFJbYZksA");
        setField(term238405, term238405.getClass(), "country_code", "jndrnlnwbO");
        setField(term238405, term238405.getClass(), "region_code", "qdFzHeHbQc");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.card.RegistrationRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "EcxYliBmNQ";
        callMethod(klass, "setA_code", argTypes, term238405, args);
    }

};


