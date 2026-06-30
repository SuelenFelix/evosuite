package icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external;

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
import static icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Integer;

public class ExternalUserData_setHighestRating_174061882366 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26589;
     Object term26840;

    public ExternalUserData_setHighestRating_174061882366() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26589 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ExternalUserData"));
        Object term26614 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term26615 = newInstance(Class.forName("java.time.LocalDate"));
        Object term26619 = newInstance(Class.forName("java.time.LocalTime"));
        Object term26675 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term26676 = newInstance(Class.forName("java.time.LocalDate"));
        Object term26680 = newInstance(Class.forName("java.time.LocalTime"));
        Object term26723 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term26724 = newInstance(Class.forName("java.time.LocalDate"));
        Object term26728 = newInstance(Class.forName("java.time.LocalTime"));
        Object term26769 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term26770 = newInstance(Class.forName("java.time.LocalDate"));
        Object term26774 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term26589, term26589.getClass(), "accessCode", "WWBYemIuiK");
        setField(term26589, term26589.getClass(), "userName", "nHYQYkycCR");
        setIntField(term26615, term26615.getClass(), "year", 2019);
        setShortField(term26615, term26615.getClass(), "month", (short) 12);
        setShortField(term26615, term26615.getClass(), "day", (short) 20);
        setField(term26614, term26614.getClass(), "date", term26615);
        setByteField(term26619, term26619.getClass(), "hour", (byte) 22);
        setByteField(term26619, term26619.getClass(), "minute", (byte) 20);
        setByteField(term26619, term26619.getClass(), "second", (byte) 29);
        setIntField(term26619, term26619.getClass(), "nano", 582302461);
        setField(term26614, term26614.getClass(), "time", term26619);
        setField(term26589, term26589.getClass(), "lastLoginDate", term26614);
        setBooleanField(term26589, term26589.getClass(), "isWebJoin", true);
        setField(term26589, term26589.getClass(), "webLimitDate", "yBiVacDcZX");
        setIntField(term26589, term26589.getClass(), "level", -1030167086);
        setIntField(term26589, term26589.getClass(), "reincarnationNum", -434230943);
        setField(term26589, term26589.getClass(), "exp", "QrKfEgQeoy");
        setLongField(term26589, term26589.getClass(), "point", -1647156882669215876L);
        setLongField(term26589, term26589.getClass(), "totalPoint", 4115148503664117517L);
        setIntField(term26589, term26589.getClass(), "playCount", 698633875);
        setIntField(term26589, term26589.getClass(), "multiPlayCount", 548468113);
        setIntField(term26589, term26589.getClass(), "multiWinCount", 1701819905);
        setIntField(term26589, term26589.getClass(), "requestResCount", 1721418943);
        setIntField(term26589, term26589.getClass(), "acceptResCount", -111082612);
        setIntField(term26589, term26589.getClass(), "successResCount", 1253334988);
        setIntField(term26589, term26589.getClass(), "playerRating", 1086709736);
        setIntField(term26589, term26589.getClass(), "highestRating", -1606698075);
        setIntField(term26589, term26589.getClass(), "nameplateId", 90996421);
        setIntField(term26589, term26589.getClass(), "frameId", -1805802783);
        setIntField(term26589, term26589.getClass(), "characterId", -529831900);
        setIntField(term26589, term26589.getClass(), "trophyId", 1574493440);
        setIntField(term26589, term26589.getClass(), "playedTutorialBit", 1854694585);
        setIntField(term26589, term26589.getClass(), "firstTutorialCancelNum", -1260562836);
        setIntField(term26589, term26589.getClass(), "masterTutorialCancelNum", 694100722);
        setIntField(term26589, term26589.getClass(), "totalRepertoireCount", -680529431);
        setIntField(term26589, term26589.getClass(), "totalMapNum", 212698793);
        setLongField(term26589, term26589.getClass(), "totalHiScore", 8527367353497875781L);
        setLongField(term26589, term26589.getClass(), "totalBasicHighScore", -6489405551733780896L);
        setLongField(term26589, term26589.getClass(), "totalAdvancedHighScore", 5818741986224130131L);
        setLongField(term26589, term26589.getClass(), "totalExpertHighScore", 370847120687610747L);
        setLongField(term26589, term26589.getClass(), "totalMasterHighScore", -6399462725251497844L);
        setIntField(term26676, term26676.getClass(), "year", 2010);
        setShortField(term26676, term26676.getClass(), "month", (short) 9);
        setShortField(term26676, term26676.getClass(), "day", (short) 26);
        setField(term26675, term26675.getClass(), "date", term26676);
        setByteField(term26680, term26680.getClass(), "hour", (byte) 17);
        setByteField(term26680, term26680.getClass(), "minute", (byte) 5);
        setByteField(term26680, term26680.getClass(), "second", (byte) 52);
        setIntField(term26680, term26680.getClass(), "nano", 138292575);
        setField(term26675, term26675.getClass(), "time", term26680);
        setField(term26589, term26589.getClass(), "eventWatchedDate", term26675);
        setIntField(term26589, term26589.getClass(), "friendCount", 1169519385);
        setBooleanField(term26589, term26589.getClass(), "isMaimai", false);
        setField(term26589, term26589.getClass(), "firstGameId", "oApgdbwnti");
        setField(term26589, term26589.getClass(), "firstRomVersion", "YcgHACNgyo");
        setField(term26589, term26589.getClass(), "firstDataVersion", "MrUPJzBTEn");
        setIntField(term26724, term26724.getClass(), "year", 2022);
        setShortField(term26724, term26724.getClass(), "month", (short) 10);
        setShortField(term26724, term26724.getClass(), "day", (short) 14);
        setField(term26723, term26723.getClass(), "date", term26724);
        setByteField(term26728, term26728.getClass(), "hour", (byte) 10);
        setByteField(term26728, term26728.getClass(), "minute", (byte) 28);
        setByteField(term26728, term26728.getClass(), "second", (byte) 24);
        setIntField(term26728, term26728.getClass(), "nano", 117469048);
        setField(term26723, term26723.getClass(), "time", term26728);
        setField(term26589, term26589.getClass(), "firstPlayDate", term26723);
        setField(term26589, term26589.getClass(), "lastGameId", "IaSymdfFGa");
        setField(term26589, term26589.getClass(), "lastRomVersion", "FxSvJCIpul");
        setField(term26589, term26589.getClass(), "lastDataVersion", "HCjKwpexJj");
        setIntField(term26770, term26770.getClass(), "year", 2012);
        setShortField(term26770, term26770.getClass(), "month", (short) 2);
        setShortField(term26770, term26770.getClass(), "day", (short) 18);
        setField(term26769, term26769.getClass(), "date", term26770);
        setByteField(term26774, term26774.getClass(), "hour", (byte) 4);
        setByteField(term26774, term26774.getClass(), "minute", (byte) 27);
        setByteField(term26774, term26774.getClass(), "second", (byte) 19);
        setIntField(term26774, term26774.getClass(), "nano", 948215601);
        setField(term26769, term26769.getClass(), "time", term26774);
        setField(term26589, term26589.getClass(), "lastPlayDate", term26769);
        setIntField(term26589, term26589.getClass(), "lastPlaceId", 1846078344);
        setField(term26589, term26589.getClass(), "lastPlaceName", "sCpIHVPdfl");
        setField(term26589, term26589.getClass(), "lastRegionId", "lMUBBGRjfY");
        setField(term26589, term26589.getClass(), "lastRegionName", "olYpqbolWL");
        setField(term26589, term26589.getClass(), "lastAllNetId", "MCMCjxXzjw");
        setField(term26589, term26589.getClass(), "lastClientId", "pZbbwCURge");
        term26840 = new Integer(1692543802);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term26840;
        callMethod(klass, "setHighestRating", argTypes, term26589, args);
    }

};


