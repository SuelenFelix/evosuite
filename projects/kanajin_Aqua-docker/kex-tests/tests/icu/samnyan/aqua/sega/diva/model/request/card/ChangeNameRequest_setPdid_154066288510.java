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

public class ChangeNameRequest_setPdid_154066288510 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28549;
     Object term28836;

    public ChangeNameRequest_setPdid_154066288510() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28549 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.card.ChangeNameRequest"));
        Object term28674 = newInstance(Class.forName("java.time.ZonedDateTime"));
        Object term28675 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term28676 = newInstance(Class.forName("java.time.LocalDate"));
        Object term28680 = newInstance(Class.forName("java.time.LocalTime"));
        Object term28685 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term28695 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term28712 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term28713 = (long[]) newLongArray(1);
        Object[] term28715 = (Object[]) newArray("java.time.ZoneOffset", 2);
        long[] term28716 = (long[]) newLongArray(39);
        Object[] term28756 = (Object[]) newArray("java.time.LocalDateTime", 78);
        Object[] term28757 = (Object[]) newArray("java.time.ZoneOffset", 40);
        Object[] term28758 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term28759 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term28549, term28549.getClass(), "a_code", "vXiaNiquft");
        setIntField(term28549, term28549.getClass(), "aime_id", 53410913);
        setField(term28549, term28549.getClass(), "aime_a_code", "lucCeiVnYe");
        setIntField(term28549, term28549.getClass(), "pd_id", -375014958);
        setIntField(term28549, term28549.getClass(), "accept_idx", 1107176718);
        setField(term28549, term28549.getClass(), "player_name", "iYwkCLMsbJ");
        setIntField(term28549, term28549.getClass(), "chg_name_price", 480137250);
        setField(term28549, term28549.getClass(), "cmd", "MXLsVQWrwc");
        setField(term28549, term28549.getClass(), "req_id", "lRaSlqzqNY");
        setField(term28549, term28549.getClass(), "game_id", "TiEyxWXsra");
        setField(term28549, term28549.getClass(), "r_ver", "TuLgwTZsPP");
        setField(term28549, term28549.getClass(), "kc_serial", "KoasxTJGpx");
        setField(term28549, term28549.getClass(), "b_serial", "ceGeARYMoa");
        setField(term28549, term28549.getClass(), "place_id", "fFWllaiFvh");
        setIntField(term28676, term28676.getClass(), "year", 2024);
        setShortField(term28676, term28676.getClass(), "month", (short) 5);
        setShortField(term28676, term28676.getClass(), "day", (short) 6);
        setField(term28675, term28675.getClass(), "date", term28676);
        setByteField(term28680, term28680.getClass(), "hour", (byte) 20);
        setByteField(term28680, term28680.getClass(), "minute", (byte) 14);
        setByteField(term28680, term28680.getClass(), "second", (byte) 27);
        setIntField(term28680, term28680.getClass(), "nano", 900636101);
        setField(term28675, term28675.getClass(), "time", term28680);
        setField(term28674, term28674.getClass(), "dateTime", term28675);
        setIntField(term28685, term28685.getClass(), "totalSeconds", -10800);
        setField(term28685, term28685.getClass(), "id", "-03:00");
        setField(term28674, term28674.getClass(), "offset", term28685);
        setField(term28695, term28695.getClass(), "id", "America/Recife");
        setLongElement(term28713, 0, -1767217224L);
        setField(term28712, term28712.getClass(), "standardTransitions", term28713);
        setElement(term28715, 1, term28685);
        setField(term28712, term28712.getClass(), "standardOffsets", term28715);
        setLongElement(term28716, 0, -1767217224L);
        setLongElement(term28716, 1, -1206957600L);
        setLongElement(term28716, 2, -1191362400L);
        setLongElement(term28716, 3, -1175374800L);
        setLongElement(term28716, 4, -1159826400L);
        setLongElement(term28716, 5, -633819600L);
        setLongElement(term28716, 6, -622069200L);
        setLongElement(term28716, 7, -602283600L);
        setLongElement(term28716, 8, -591832800L);
        setLongElement(term28716, 9, -570747600L);
        setLongElement(term28716, 10, -560210400L);
        setLongElement(term28716, 11, -539125200L);
        setLongElement(term28716, 12, -531352800L);
        setLongElement(term28716, 13, -191365200L);
        setLongElement(term28716, 14, -184197600L);
        setLongElement(term28716, 15, -155163600L);
        setLongElement(term28716, 16, -150069600L);
        setLongElement(term28716, 17, -128898000L);
        setLongElement(term28716, 18, -121125600L);
        setLongElement(term28716, 19, -99954000L);
        setLongElement(term28716, 20, -89589600L);
        setLongElement(term28716, 21, -68418000L);
        setLongElement(term28716, 22, -57967200L);
        setLongElement(term28716, 23, 499748400L);
        setLongElement(term28716, 24, 511236000L);
        setLongElement(term28716, 25, 530593200L);
        setLongElement(term28716, 26, 540266400L);
        setLongElement(term28716, 27, 562129200L);
        setLongElement(term28716, 28, 571197600L);
        setLongElement(term28716, 29, 592974000L);
        setLongElement(term28716, 30, 602042400L);
        setLongElement(term28716, 31, 624423600L);
        setLongElement(term28716, 32, 634701600L);
        setLongElement(term28716, 33, 938919600L);
        setLongElement(term28716, 34, 951616800L);
        setLongElement(term28716, 35, 970974000L);
        setLongElement(term28716, 36, 971575200L);
        setLongElement(term28716, 37, 1003028400L);
        setLongElement(term28716, 38, 1013911200L);
        setField(term28712, term28712.getClass(), "savingsInstantTransitions", term28716);
        setField(term28712, term28712.getClass(), "savingsLocalTransitions", term28756);
        setElement(term28757, 1, term28685);
        setElement(term28757, 3, term28685);
        setElement(term28757, 5, term28685);
        setElement(term28757, 7, term28685);
        setElement(term28757, 9, term28685);
        setElement(term28757, 11, term28685);
        setElement(term28757, 13, term28685);
        setElement(term28757, 15, term28685);
        setElement(term28757, 17, term28685);
        setElement(term28757, 19, term28685);
        setElement(term28757, 21, term28685);
        setElement(term28757, 23, term28685);
        setElement(term28757, 25, term28685);
        setElement(term28757, 27, term28685);
        setElement(term28757, 29, term28685);
        setElement(term28757, 31, term28685);
        setElement(term28757, 33, term28685);
        setElement(term28757, 35, term28685);
        setElement(term28757, 37, term28685);
        setElement(term28757, 39, term28685);
        setField(term28712, term28712.getClass(), "wallOffsets", term28757);
        setField(term28712, term28712.getClass(), "lastRules", term28758);
        setField(term28759, term28759.getClass(), "table", null);
        setField(term28759, term28759.getClass(), "nextTable", null);
        setLongField(term28759, term28759.getClass(), "baseCount", 0L);
        setIntField(term28759, term28759.getClass(), "sizeCtl", 0);
        setIntField(term28759, term28759.getClass(), "transferIndex", 0);
        setIntField(term28759, term28759.getClass(), "cellsBusy", 0);
        setField(term28759, term28759.getClass(), "counterCells", null);
        setField(term28759, term28759.getClass(), "keySet", null);
        setField(term28759, term28759.getClass(), "values", null);
        setField(term28759, term28759.getClass(), "entrySet", null);
        setField(term28759, term28759.getClass(), "keySet", null);
        setField(term28759, term28759.getClass(), "values", null);
        setField(term28712, term28712.getClass(), "lastRulesCache", term28759);
        setField(term28695, term28695.getClass(), "rules", term28712);
        setField(term28674, term28674.getClass(), "zone", term28695);
        setField(term28549, term28549.getClass(), "time_stamp", term28674);
        setField(term28549, term28549.getClass(), "start_up_mode", "PFTdEDSbvZ");
        setField(term28549, term28549.getClass(), "cmm_dly_mod", "TbiwoiebNe");
        setField(term28549, term28549.getClass(), "cmm_dly_sec", "laTITSWZuc");
        setField(term28549, term28549.getClass(), "cmm_err_mod", "fkzRpxlAqS");
        setField(term28549, term28549.getClass(), "country_code", "VYvbTGKslj");
        setField(term28549, term28549.getClass(), "region_code", "owLqDDnwZA");
        term28836 = new Integer(-341152642);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.card.ChangeNameRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term28836;
        callMethod(klass, "setPd_id", argTypes, term28549, args);
    }

};


