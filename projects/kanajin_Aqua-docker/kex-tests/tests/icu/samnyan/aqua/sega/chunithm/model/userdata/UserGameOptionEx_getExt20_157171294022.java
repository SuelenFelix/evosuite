package icu.samnyan.aqua.sega.chunithm.model.userdata;

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
import static icu.samnyan.aqua.sega.chunithm.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;

public class UserGameOptionEx_getExt20_157171294022 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term319439;

    public UserGameOptionEx_getExt20_157171294022() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term319445 = new Long(6252795312796363233L);
        term319439 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGameOptionEx"));
        Object term319441 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term319443 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term319459 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term319460 = newInstance(Class.forName("java.time.LocalDate"));
        Object term319464 = newInstance(Class.forName("java.time.LocalTime"));
        Object term319469 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term319470 = newInstance(Class.forName("java.time.LocalDate"));
        Object term319474 = newInstance(Class.forName("java.time.LocalTime"));
        Object term319491 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term319492 = newInstance(Class.forName("java.time.LocalDate"));
        Object term319496 = newInstance(Class.forName("java.time.LocalTime"));
        Object term319552 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term319553 = newInstance(Class.forName("java.time.LocalDate"));
        Object term319557 = newInstance(Class.forName("java.time.LocalTime"));
        Object term319600 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term319601 = newInstance(Class.forName("java.time.LocalDate"));
        Object term319605 = newInstance(Class.forName("java.time.LocalTime"));
        Object term319646 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term319647 = newInstance(Class.forName("java.time.LocalDate"));
        Object term319651 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term319439, term319439.getClass(), "id", -5992307503492495034L);
        setLongField(term319441, term319441.getClass(), "id", -8627807026781394638L);
        setLongField(term319443, term319443.getClass(), "id", -8237795903098574568L);
        setField(term319443, term319443.getClass(), "extId", term319445);
        setField(term319443, term319443.getClass(), "luid", "vZXmZnJkmA");
        setIntField(term319460, term319460.getClass(), "year", 2021);
        setShortField(term319460, term319460.getClass(), "month", (short) 12);
        setShortField(term319460, term319460.getClass(), "day", (short) 21);
        setField(term319459, term319459.getClass(), "date", term319460);
        setByteField(term319464, term319464.getClass(), "hour", (byte) 2);
        setByteField(term319464, term319464.getClass(), "minute", (byte) 27);
        setByteField(term319464, term319464.getClass(), "second", (byte) 14);
        setIntField(term319464, term319464.getClass(), "nano", 52099716);
        setField(term319459, term319459.getClass(), "time", term319464);
        setField(term319443, term319443.getClass(), "registerTime", term319459);
        setIntField(term319470, term319470.getClass(), "year", 2026);
        setShortField(term319470, term319470.getClass(), "month", (short) 7);
        setShortField(term319470, term319470.getClass(), "day", (short) 7);
        setField(term319469, term319469.getClass(), "date", term319470);
        setByteField(term319474, term319474.getClass(), "hour", (byte) 20);
        setByteField(term319474, term319474.getClass(), "minute", (byte) 23);
        setByteField(term319474, term319474.getClass(), "second", (byte) 5);
        setIntField(term319474, term319474.getClass(), "nano", 956011908);
        setField(term319469, term319469.getClass(), "time", term319474);
        setField(term319443, term319443.getClass(), "accessTime", term319469);
        setField(term319441, term319441.getClass(), "card", term319443);
        setField(term319441, term319441.getClass(), "userName", "DLsTUONaVG");
        setIntField(term319492, term319492.getClass(), "year", 2011);
        setShortField(term319492, term319492.getClass(), "month", (short) 12);
        setShortField(term319492, term319492.getClass(), "day", (short) 1);
        setField(term319491, term319491.getClass(), "date", term319492);
        setByteField(term319496, term319496.getClass(), "hour", (byte) 10);
        setByteField(term319496, term319496.getClass(), "minute", (byte) 7);
        setByteField(term319496, term319496.getClass(), "second", (byte) 53);
        setIntField(term319496, term319496.getClass(), "nano", 306149755);
        setField(term319491, term319491.getClass(), "time", term319496);
        setField(term319441, term319441.getClass(), "lastLoginDate", term319491);
        setBooleanField(term319441, term319441.getClass(), "isWebJoin", false);
        setField(term319441, term319441.getClass(), "webLimitDate", "CMxBJvoWmb");
        setIntField(term319441, term319441.getClass(), "level", 1845202050);
        setIntField(term319441, term319441.getClass(), "reincarnationNum", -259872076);
        setField(term319441, term319441.getClass(), "exp", "gxdAZEpSgS");
        setLongField(term319441, term319441.getClass(), "point", 4442762297096294204L);
        setLongField(term319441, term319441.getClass(), "totalPoint", 6038479498425106910L);
        setIntField(term319441, term319441.getClass(), "playCount", 198838341);
        setIntField(term319441, term319441.getClass(), "multiPlayCount", -327992686);
        setIntField(term319441, term319441.getClass(), "multiWinCount", 274261047);
        setIntField(term319441, term319441.getClass(), "requestResCount", 94059237);
        setIntField(term319441, term319441.getClass(), "acceptResCount", 261356472);
        setIntField(term319441, term319441.getClass(), "successResCount", -1633964080);
        setIntField(term319441, term319441.getClass(), "playerRating", -908460509);
        setIntField(term319441, term319441.getClass(), "highestRating", 1263655765);
        setIntField(term319441, term319441.getClass(), "nameplateId", 1819531350);
        setIntField(term319441, term319441.getClass(), "frameId", -1806268976);
        setIntField(term319441, term319441.getClass(), "characterId", -588625518);
        setIntField(term319441, term319441.getClass(), "trophyId", -1322012320);
        setIntField(term319441, term319441.getClass(), "playedTutorialBit", 354204124);
        setIntField(term319441, term319441.getClass(), "firstTutorialCancelNum", -1384573133);
        setIntField(term319441, term319441.getClass(), "masterTutorialCancelNum", -702875576);
        setIntField(term319441, term319441.getClass(), "totalRepertoireCount", 1945418003);
        setIntField(term319441, term319441.getClass(), "totalMapNum", 1499410902);
        setLongField(term319441, term319441.getClass(), "totalHiScore", -1430997230026136507L);
        setLongField(term319441, term319441.getClass(), "totalBasicHighScore", -7698255142334748068L);
        setLongField(term319441, term319441.getClass(), "totalAdvancedHighScore", -3113967336998881340L);
        setLongField(term319441, term319441.getClass(), "totalExpertHighScore", -6726339959134278258L);
        setLongField(term319441, term319441.getClass(), "totalMasterHighScore", -3539068786560687629L);
        setIntField(term319553, term319553.getClass(), "year", 2016);
        setShortField(term319553, term319553.getClass(), "month", (short) 10);
        setShortField(term319553, term319553.getClass(), "day", (short) 14);
        setField(term319552, term319552.getClass(), "date", term319553);
        setByteField(term319557, term319557.getClass(), "hour", (byte) 13);
        setByteField(term319557, term319557.getClass(), "minute", (byte) 44);
        setByteField(term319557, term319557.getClass(), "second", (byte) 53);
        setIntField(term319557, term319557.getClass(), "nano", 729311301);
        setField(term319552, term319552.getClass(), "time", term319557);
        setField(term319441, term319441.getClass(), "eventWatchedDate", term319552);
        setIntField(term319441, term319441.getClass(), "friendCount", 2137116320);
        setBooleanField(term319441, term319441.getClass(), "isMaimai", true);
        setField(term319441, term319441.getClass(), "firstGameId", "JKJdAtnrrF");
        setField(term319441, term319441.getClass(), "firstRomVersion", "GpoyHXGieZ");
        setField(term319441, term319441.getClass(), "firstDataVersion", "cEFsvMVCTU");
        setIntField(term319601, term319601.getClass(), "year", 2010);
        setShortField(term319601, term319601.getClass(), "month", (short) 1);
        setShortField(term319601, term319601.getClass(), "day", (short) 25);
        setField(term319600, term319600.getClass(), "date", term319601);
        setByteField(term319605, term319605.getClass(), "hour", (byte) 3);
        setByteField(term319605, term319605.getClass(), "minute", (byte) 4);
        setByteField(term319605, term319605.getClass(), "second", (byte) 25);
        setIntField(term319605, term319605.getClass(), "nano", 7841589);
        setField(term319600, term319600.getClass(), "time", term319605);
        setField(term319441, term319441.getClass(), "firstPlayDate", term319600);
        setField(term319441, term319441.getClass(), "lastGameId", "AqNriHImMY");
        setField(term319441, term319441.getClass(), "lastRomVersion", "mwSajMxzKy");
        setField(term319441, term319441.getClass(), "lastDataVersion", "mmzfmREmvG");
        setIntField(term319647, term319647.getClass(), "year", 2011);
        setShortField(term319647, term319647.getClass(), "month", (short) 6);
        setShortField(term319647, term319647.getClass(), "day", (short) 16);
        setField(term319646, term319646.getClass(), "date", term319647);
        setByteField(term319651, term319651.getClass(), "hour", (byte) 12);
        setByteField(term319651, term319651.getClass(), "minute", (byte) 21);
        setByteField(term319651, term319651.getClass(), "second", (byte) 48);
        setIntField(term319651, term319651.getClass(), "nano", 641999031);
        setField(term319646, term319646.getClass(), "time", term319651);
        setField(term319441, term319441.getClass(), "lastPlayDate", term319646);
        setIntField(term319441, term319441.getClass(), "lastPlaceId", 1142212038);
        setField(term319441, term319441.getClass(), "lastPlaceName", "QDgqKUuIMf");
        setField(term319441, term319441.getClass(), "lastRegionId", "KSrOHHauRF");
        setField(term319441, term319441.getClass(), "lastRegionName", "crvtEHvIWK");
        setField(term319441, term319441.getClass(), "lastAllNetId", "glDRFmYutu");
        setField(term319441, term319441.getClass(), "lastClientId", "HfTMHxIhyF");
        setField(term319439, term319439.getClass(), "user", term319441);
        setIntField(term319439, term319439.getClass(), "ext1", 1394128162);
        setIntField(term319439, term319439.getClass(), "ext2", 1403824778);
        setIntField(term319439, term319439.getClass(), "ext3", 2082609623);
        setIntField(term319439, term319439.getClass(), "ext4", -2092405045);
        setIntField(term319439, term319439.getClass(), "ext5", 2082908703);
        setIntField(term319439, term319439.getClass(), "ext6", -89943020);
        setIntField(term319439, term319439.getClass(), "ext7", 820771333);
        setIntField(term319439, term319439.getClass(), "ext8", -1481597667);
        setIntField(term319439, term319439.getClass(), "ext9", -1665378071);
        setIntField(term319439, term319439.getClass(), "ext10", -833699886);
        setIntField(term319439, term319439.getClass(), "ext11", -296237735);
        setIntField(term319439, term319439.getClass(), "ext12", -1696576632);
        setIntField(term319439, term319439.getClass(), "ext13", 1211788385);
        setIntField(term319439, term319439.getClass(), "ext14", 225742337);
        setIntField(term319439, term319439.getClass(), "ext15", -380899882);
        setIntField(term319439, term319439.getClass(), "ext16", 2126833191);
        setIntField(term319439, term319439.getClass(), "ext17", 605638244);
        setIntField(term319439, term319439.getClass(), "ext18", -1241984600);
        setIntField(term319439, term319439.getClass(), "ext19", 630841707);
        setIntField(term319439, term319439.getClass(), "ext20", 1848879841);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGameOptionEx");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getExt20", argTypes, term319439, args);
    }

};


