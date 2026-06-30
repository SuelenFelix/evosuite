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

public class UserGameOptionEx_getExt13_157173984815 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term316303;

    public UserGameOptionEx_getExt13_157173984815() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term316309 = new Long(4006388896509492239L);
        term316303 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGameOptionEx"));
        Object term316305 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term316307 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term316323 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term316324 = newInstance(Class.forName("java.time.LocalDate"));
        Object term316328 = newInstance(Class.forName("java.time.LocalTime"));
        Object term316333 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term316334 = newInstance(Class.forName("java.time.LocalDate"));
        Object term316338 = newInstance(Class.forName("java.time.LocalTime"));
        Object term316355 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term316356 = newInstance(Class.forName("java.time.LocalDate"));
        Object term316360 = newInstance(Class.forName("java.time.LocalTime"));
        Object term316416 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term316417 = newInstance(Class.forName("java.time.LocalDate"));
        Object term316421 = newInstance(Class.forName("java.time.LocalTime"));
        Object term316464 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term316465 = newInstance(Class.forName("java.time.LocalDate"));
        Object term316469 = newInstance(Class.forName("java.time.LocalTime"));
        Object term316510 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term316511 = newInstance(Class.forName("java.time.LocalDate"));
        Object term316515 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term316303, term316303.getClass(), "id", 5853330021331831999L);
        setLongField(term316305, term316305.getClass(), "id", 831091054418959189L);
        setLongField(term316307, term316307.getClass(), "id", 8674771096382942509L);
        setField(term316307, term316307.getClass(), "extId", term316309);
        setField(term316307, term316307.getClass(), "luid", "QeeIOyYsmx");
        setIntField(term316324, term316324.getClass(), "year", 2017);
        setShortField(term316324, term316324.getClass(), "month", (short) 7);
        setShortField(term316324, term316324.getClass(), "day", (short) 13);
        setField(term316323, term316323.getClass(), "date", term316324);
        setByteField(term316328, term316328.getClass(), "hour", (byte) 2);
        setByteField(term316328, term316328.getClass(), "minute", (byte) 20);
        setByteField(term316328, term316328.getClass(), "second", (byte) 53);
        setIntField(term316328, term316328.getClass(), "nano", 516313245);
        setField(term316323, term316323.getClass(), "time", term316328);
        setField(term316307, term316307.getClass(), "registerTime", term316323);
        setIntField(term316334, term316334.getClass(), "year", 2016);
        setShortField(term316334, term316334.getClass(), "month", (short) 6);
        setShortField(term316334, term316334.getClass(), "day", (short) 25);
        setField(term316333, term316333.getClass(), "date", term316334);
        setByteField(term316338, term316338.getClass(), "hour", (byte) 19);
        setByteField(term316338, term316338.getClass(), "minute", (byte) 45);
        setByteField(term316338, term316338.getClass(), "second", (byte) 25);
        setIntField(term316338, term316338.getClass(), "nano", 831992945);
        setField(term316333, term316333.getClass(), "time", term316338);
        setField(term316307, term316307.getClass(), "accessTime", term316333);
        setField(term316305, term316305.getClass(), "card", term316307);
        setField(term316305, term316305.getClass(), "userName", "tREUVNKzCo");
        setIntField(term316356, term316356.getClass(), "year", 2013);
        setShortField(term316356, term316356.getClass(), "month", (short) 10);
        setShortField(term316356, term316356.getClass(), "day", (short) 20);
        setField(term316355, term316355.getClass(), "date", term316356);
        setByteField(term316360, term316360.getClass(), "hour", (byte) 18);
        setByteField(term316360, term316360.getClass(), "minute", (byte) 40);
        setByteField(term316360, term316360.getClass(), "second", (byte) 11);
        setIntField(term316360, term316360.getClass(), "nano", 668850527);
        setField(term316355, term316355.getClass(), "time", term316360);
        setField(term316305, term316305.getClass(), "lastLoginDate", term316355);
        setBooleanField(term316305, term316305.getClass(), "isWebJoin", true);
        setField(term316305, term316305.getClass(), "webLimitDate", "oMVmfIrXEu");
        setIntField(term316305, term316305.getClass(), "level", -622903896);
        setIntField(term316305, term316305.getClass(), "reincarnationNum", -445119540);
        setField(term316305, term316305.getClass(), "exp", "wpVzLLfXkK");
        setLongField(term316305, term316305.getClass(), "point", -7851097320913123376L);
        setLongField(term316305, term316305.getClass(), "totalPoint", 7086059537366156321L);
        setIntField(term316305, term316305.getClass(), "playCount", 2085203030);
        setIntField(term316305, term316305.getClass(), "multiPlayCount", 2033592479);
        setIntField(term316305, term316305.getClass(), "multiWinCount", 1523373764);
        setIntField(term316305, term316305.getClass(), "requestResCount", -1381691518);
        setIntField(term316305, term316305.getClass(), "acceptResCount", -1055770237);
        setIntField(term316305, term316305.getClass(), "successResCount", 1516770789);
        setIntField(term316305, term316305.getClass(), "playerRating", -2146641428);
        setIntField(term316305, term316305.getClass(), "highestRating", 1813536424);
        setIntField(term316305, term316305.getClass(), "nameplateId", -1827932155);
        setIntField(term316305, term316305.getClass(), "frameId", -1840714834);
        setIntField(term316305, term316305.getClass(), "characterId", 42295520);
        setIntField(term316305, term316305.getClass(), "trophyId", 250658921);
        setIntField(term316305, term316305.getClass(), "playedTutorialBit", -699106220);
        setIntField(term316305, term316305.getClass(), "firstTutorialCancelNum", 1231601627);
        setIntField(term316305, term316305.getClass(), "masterTutorialCancelNum", -619938699);
        setIntField(term316305, term316305.getClass(), "totalRepertoireCount", 2041807519);
        setIntField(term316305, term316305.getClass(), "totalMapNum", -1588301237);
        setLongField(term316305, term316305.getClass(), "totalHiScore", 7965921666937548237L);
        setLongField(term316305, term316305.getClass(), "totalBasicHighScore", 9152085923000902928L);
        setLongField(term316305, term316305.getClass(), "totalAdvancedHighScore", -1155570685161585580L);
        setLongField(term316305, term316305.getClass(), "totalExpertHighScore", 9077525443390876981L);
        setLongField(term316305, term316305.getClass(), "totalMasterHighScore", -4324028422138106655L);
        setIntField(term316417, term316417.getClass(), "year", 2025);
        setShortField(term316417, term316417.getClass(), "month", (short) 3);
        setShortField(term316417, term316417.getClass(), "day", (short) 2);
        setField(term316416, term316416.getClass(), "date", term316417);
        setByteField(term316421, term316421.getClass(), "hour", (byte) 9);
        setByteField(term316421, term316421.getClass(), "minute", (byte) 40);
        setByteField(term316421, term316421.getClass(), "second", (byte) 55);
        setIntField(term316421, term316421.getClass(), "nano", 94857393);
        setField(term316416, term316416.getClass(), "time", term316421);
        setField(term316305, term316305.getClass(), "eventWatchedDate", term316416);
        setIntField(term316305, term316305.getClass(), "friendCount", 674010604);
        setBooleanField(term316305, term316305.getClass(), "isMaimai", true);
        setField(term316305, term316305.getClass(), "firstGameId", "SEPrgtTBVv");
        setField(term316305, term316305.getClass(), "firstRomVersion", "vtJRIanbwg");
        setField(term316305, term316305.getClass(), "firstDataVersion", "JbrLDrpoAv");
        setIntField(term316465, term316465.getClass(), "year", 2022);
        setShortField(term316465, term316465.getClass(), "month", (short) 8);
        setShortField(term316465, term316465.getClass(), "day", (short) 5);
        setField(term316464, term316464.getClass(), "date", term316465);
        setByteField(term316469, term316469.getClass(), "hour", (byte) 11);
        setByteField(term316469, term316469.getClass(), "minute", (byte) 45);
        setByteField(term316469, term316469.getClass(), "second", (byte) 49);
        setIntField(term316469, term316469.getClass(), "nano", 204145368);
        setField(term316464, term316464.getClass(), "time", term316469);
        setField(term316305, term316305.getClass(), "firstPlayDate", term316464);
        setField(term316305, term316305.getClass(), "lastGameId", "kLAYfNPTYi");
        setField(term316305, term316305.getClass(), "lastRomVersion", "bgvEvjROsI");
        setField(term316305, term316305.getClass(), "lastDataVersion", "dDgTwPNnoh");
        setIntField(term316511, term316511.getClass(), "year", 2022);
        setShortField(term316511, term316511.getClass(), "month", (short) 12);
        setShortField(term316511, term316511.getClass(), "day", (short) 13);
        setField(term316510, term316510.getClass(), "date", term316511);
        setByteField(term316515, term316515.getClass(), "hour", (byte) 9);
        setByteField(term316515, term316515.getClass(), "minute", (byte) 10);
        setByteField(term316515, term316515.getClass(), "second", (byte) 53);
        setIntField(term316515, term316515.getClass(), "nano", 442184961);
        setField(term316510, term316510.getClass(), "time", term316515);
        setField(term316305, term316305.getClass(), "lastPlayDate", term316510);
        setIntField(term316305, term316305.getClass(), "lastPlaceId", -1993946490);
        setField(term316305, term316305.getClass(), "lastPlaceName", "kMDHgEGnfj");
        setField(term316305, term316305.getClass(), "lastRegionId", "inHvGjtHrL");
        setField(term316305, term316305.getClass(), "lastRegionName", "IkxYpScZwm");
        setField(term316305, term316305.getClass(), "lastAllNetId", "soyBRfWJGI");
        setField(term316305, term316305.getClass(), "lastClientId", "fboIWAsrJZ");
        setField(term316303, term316303.getClass(), "user", term316305);
        setIntField(term316303, term316303.getClass(), "ext1", 1192985277);
        setIntField(term316303, term316303.getClass(), "ext2", 356951618);
        setIntField(term316303, term316303.getClass(), "ext3", -1864027009);
        setIntField(term316303, term316303.getClass(), "ext4", -1606093016);
        setIntField(term316303, term316303.getClass(), "ext5", 1649273071);
        setIntField(term316303, term316303.getClass(), "ext6", -1224864932);
        setIntField(term316303, term316303.getClass(), "ext7", 54480662);
        setIntField(term316303, term316303.getClass(), "ext8", 1555799329);
        setIntField(term316303, term316303.getClass(), "ext9", -1426263681);
        setIntField(term316303, term316303.getClass(), "ext10", -220900580);
        setIntField(term316303, term316303.getClass(), "ext11", -1612314595);
        setIntField(term316303, term316303.getClass(), "ext12", 74725785);
        setIntField(term316303, term316303.getClass(), "ext13", -576493446);
        setIntField(term316303, term316303.getClass(), "ext14", -1572345282);
        setIntField(term316303, term316303.getClass(), "ext15", 1765609258);
        setIntField(term316303, term316303.getClass(), "ext16", -1945295087);
        setIntField(term316303, term316303.getClass(), "ext17", -1903576173);
        setIntField(term316303, term316303.getClass(), "ext18", -1319276860);
        setIntField(term316303, term316303.getClass(), "ext19", 1890049926);
        setIntField(term316303, term316303.getClass(), "ext20", -100019307);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGameOptionEx");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getExt13", argTypes, term316303, args);
    }

};


