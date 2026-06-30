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

public class BuyCstmzItmRequest_getAcceptidx_15154179721 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term273559;

    public BuyCstmzItmRequest_getAcceptidx_15154179721() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term273559 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.ingame.BuyCstmzItmRequest"));
        Object term273649 = newInstance(Class.forName("java.time.ZonedDateTime"));
        Object term273650 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term273651 = newInstance(Class.forName("java.time.LocalDate"));
        Object term273655 = newInstance(Class.forName("java.time.LocalTime"));
        Object term273660 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term273670 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term273687 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term273688 = (long[]) newLongArray(1);
        Object[] term273690 = (Object[]) newArray("java.time.ZoneOffset", 2);
        long[] term273691 = (long[]) newLongArray(39);
        Object[] term273731 = (Object[]) newArray("java.time.LocalDateTime", 78);
        Object[] term273732 = (Object[]) newArray("java.time.ZoneOffset", 40);
        Object[] term273733 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term273734 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setIntField(term273559, term273559.getClass(), "pd_id", 1100086857);
        setIntField(term273559, term273559.getClass(), "accept_idx", -394166140);
        setIntField(term273559, term273559.getClass(), "start_idx", 42058825);
        setIntField(term273559, term273559.getClass(), "cstmz_itm_id", -1402244182);
        setIntField(term273559, term273559.getClass(), "cstmz_itm_price", 993721911);
        setField(term273559, term273559.getClass(), "cmd", "ZyTXwKjtvO");
        setField(term273559, term273559.getClass(), "req_id", "mrIomiQpXW");
        setField(term273559, term273559.getClass(), "game_id", "mDIAdszXHc");
        setField(term273559, term273559.getClass(), "r_ver", "GYljRejWKI");
        setField(term273559, term273559.getClass(), "kc_serial", "AwXWFyuuXB");
        setField(term273559, term273559.getClass(), "b_serial", "hHUEukVMwn");
        setField(term273559, term273559.getClass(), "place_id", "yvAOmWOExs");
        setIntField(term273651, term273651.getClass(), "year", 2016);
        setShortField(term273651, term273651.getClass(), "month", (short) 2);
        setShortField(term273651, term273651.getClass(), "day", (short) 2);
        setField(term273650, term273650.getClass(), "date", term273651);
        setByteField(term273655, term273655.getClass(), "hour", (byte) 16);
        setByteField(term273655, term273655.getClass(), "minute", (byte) 51);
        setByteField(term273655, term273655.getClass(), "second", (byte) 8);
        setIntField(term273655, term273655.getClass(), "nano", 991355221);
        setField(term273650, term273650.getClass(), "time", term273655);
        setField(term273649, term273649.getClass(), "dateTime", term273650);
        setIntField(term273660, term273660.getClass(), "totalSeconds", -10800);
        setField(term273660, term273660.getClass(), "id", "-03:00");
        setField(term273649, term273649.getClass(), "offset", term273660);
        setField(term273670, term273670.getClass(), "id", "America/Recife");
        setLongElement(term273688, 0, -1767217224L);
        setField(term273687, term273687.getClass(), "standardTransitions", term273688);
        setElement(term273690, 1, term273660);
        setField(term273687, term273687.getClass(), "standardOffsets", term273690);
        setLongElement(term273691, 0, -1767217224L);
        setLongElement(term273691, 1, -1206957600L);
        setLongElement(term273691, 2, -1191362400L);
        setLongElement(term273691, 3, -1175374800L);
        setLongElement(term273691, 4, -1159826400L);
        setLongElement(term273691, 5, -633819600L);
        setLongElement(term273691, 6, -622069200L);
        setLongElement(term273691, 7, -602283600L);
        setLongElement(term273691, 8, -591832800L);
        setLongElement(term273691, 9, -570747600L);
        setLongElement(term273691, 10, -560210400L);
        setLongElement(term273691, 11, -539125200L);
        setLongElement(term273691, 12, -531352800L);
        setLongElement(term273691, 13, -191365200L);
        setLongElement(term273691, 14, -184197600L);
        setLongElement(term273691, 15, -155163600L);
        setLongElement(term273691, 16, -150069600L);
        setLongElement(term273691, 17, -128898000L);
        setLongElement(term273691, 18, -121125600L);
        setLongElement(term273691, 19, -99954000L);
        setLongElement(term273691, 20, -89589600L);
        setLongElement(term273691, 21, -68418000L);
        setLongElement(term273691, 22, -57967200L);
        setLongElement(term273691, 23, 499748400L);
        setLongElement(term273691, 24, 511236000L);
        setLongElement(term273691, 25, 530593200L);
        setLongElement(term273691, 26, 540266400L);
        setLongElement(term273691, 27, 562129200L);
        setLongElement(term273691, 28, 571197600L);
        setLongElement(term273691, 29, 592974000L);
        setLongElement(term273691, 30, 602042400L);
        setLongElement(term273691, 31, 624423600L);
        setLongElement(term273691, 32, 634701600L);
        setLongElement(term273691, 33, 938919600L);
        setLongElement(term273691, 34, 951616800L);
        setLongElement(term273691, 35, 970974000L);
        setLongElement(term273691, 36, 971575200L);
        setLongElement(term273691, 37, 1003028400L);
        setLongElement(term273691, 38, 1013911200L);
        setField(term273687, term273687.getClass(), "savingsInstantTransitions", term273691);
        setField(term273687, term273687.getClass(), "savingsLocalTransitions", term273731);
        setElement(term273732, 1, term273660);
        setElement(term273732, 3, term273660);
        setElement(term273732, 5, term273660);
        setElement(term273732, 7, term273660);
        setElement(term273732, 9, term273660);
        setElement(term273732, 11, term273660);
        setElement(term273732, 13, term273660);
        setElement(term273732, 15, term273660);
        setElement(term273732, 17, term273660);
        setElement(term273732, 19, term273660);
        setElement(term273732, 21, term273660);
        setElement(term273732, 23, term273660);
        setElement(term273732, 25, term273660);
        setElement(term273732, 27, term273660);
        setElement(term273732, 29, term273660);
        setElement(term273732, 31, term273660);
        setElement(term273732, 33, term273660);
        setElement(term273732, 35, term273660);
        setElement(term273732, 37, term273660);
        setElement(term273732, 39, term273660);
        setField(term273687, term273687.getClass(), "wallOffsets", term273732);
        setField(term273687, term273687.getClass(), "lastRules", term273733);
        setField(term273734, term273734.getClass(), "table", null);
        setField(term273734, term273734.getClass(), "nextTable", null);
        setLongField(term273734, term273734.getClass(), "baseCount", 0L);
        setIntField(term273734, term273734.getClass(), "sizeCtl", 0);
        setIntField(term273734, term273734.getClass(), "transferIndex", 0);
        setIntField(term273734, term273734.getClass(), "cellsBusy", 0);
        setField(term273734, term273734.getClass(), "counterCells", null);
        setField(term273734, term273734.getClass(), "keySet", null);
        setField(term273734, term273734.getClass(), "values", null);
        setField(term273734, term273734.getClass(), "entrySet", null);
        setField(term273734, term273734.getClass(), "keySet", null);
        setField(term273734, term273734.getClass(), "values", null);
        setField(term273687, term273687.getClass(), "lastRulesCache", term273734);
        setField(term273670, term273670.getClass(), "rules", term273687);
        setField(term273649, term273649.getClass(), "zone", term273670);
        setField(term273559, term273559.getClass(), "time_stamp", term273649);
        setField(term273559, term273559.getClass(), "start_up_mode", "DmsJwEkQmO");
        setField(term273559, term273559.getClass(), "cmm_dly_mod", "HzibsEDFOp");
        setField(term273559, term273559.getClass(), "cmm_dly_sec", "nxccuKoVbt");
        setField(term273559, term273559.getClass(), "cmm_err_mod", "fgSbKLymzA");
        setField(term273559, term273559.getClass(), "country_code", "kSFJgZpdtf");
        setField(term273559, term273559.getClass(), "region_code", "ujNUCJKMUq");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.ingame.BuyCstmzItmRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAccept_idx", argTypes, term273559, args);
    }

};


