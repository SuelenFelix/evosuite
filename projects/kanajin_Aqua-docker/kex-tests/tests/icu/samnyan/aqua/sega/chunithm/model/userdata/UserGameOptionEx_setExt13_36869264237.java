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
import java.lang.Integer;

public class UserGameOptionEx_setExt13_36869264237 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term326611;
     Object term326909;

    public UserGameOptionEx_setExt13_36869264237() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term326617 = new Long(-1413653349314156044L);
        term326611 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGameOptionEx"));
        Object term326613 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term326615 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term326631 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term326632 = newInstance(Class.forName("java.time.LocalDate"));
        Object term326636 = newInstance(Class.forName("java.time.LocalTime"));
        Object term326641 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term326642 = newInstance(Class.forName("java.time.LocalDate"));
        Object term326646 = newInstance(Class.forName("java.time.LocalTime"));
        Object term326663 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term326664 = newInstance(Class.forName("java.time.LocalDate"));
        Object term326668 = newInstance(Class.forName("java.time.LocalTime"));
        Object term326724 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term326725 = newInstance(Class.forName("java.time.LocalDate"));
        Object term326729 = newInstance(Class.forName("java.time.LocalTime"));
        Object term326772 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term326773 = newInstance(Class.forName("java.time.LocalDate"));
        Object term326777 = newInstance(Class.forName("java.time.LocalTime"));
        Object term326818 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term326819 = newInstance(Class.forName("java.time.LocalDate"));
        Object term326823 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term326611, term326611.getClass(), "id", 8946410365493398032L);
        setLongField(term326613, term326613.getClass(), "id", 7968389197388339392L);
        setLongField(term326615, term326615.getClass(), "id", 7481016473114257898L);
        setField(term326615, term326615.getClass(), "extId", term326617);
        setField(term326615, term326615.getClass(), "luid", "ZOXdaxYVyA");
        setIntField(term326632, term326632.getClass(), "year", 2016);
        setShortField(term326632, term326632.getClass(), "month", (short) 7);
        setShortField(term326632, term326632.getClass(), "day", (short) 8);
        setField(term326631, term326631.getClass(), "date", term326632);
        setByteField(term326636, term326636.getClass(), "hour", (byte) 21);
        setByteField(term326636, term326636.getClass(), "minute", (byte) 9);
        setByteField(term326636, term326636.getClass(), "second", (byte) 23);
        setIntField(term326636, term326636.getClass(), "nano", 315804009);
        setField(term326631, term326631.getClass(), "time", term326636);
        setField(term326615, term326615.getClass(), "registerTime", term326631);
        setIntField(term326642, term326642.getClass(), "year", 2011);
        setShortField(term326642, term326642.getClass(), "month", (short) 10);
        setShortField(term326642, term326642.getClass(), "day", (short) 11);
        setField(term326641, term326641.getClass(), "date", term326642);
        setByteField(term326646, term326646.getClass(), "hour", (byte) 1);
        setByteField(term326646, term326646.getClass(), "minute", (byte) 35);
        setByteField(term326646, term326646.getClass(), "second", (byte) 19);
        setIntField(term326646, term326646.getClass(), "nano", 27333850);
        setField(term326641, term326641.getClass(), "time", term326646);
        setField(term326615, term326615.getClass(), "accessTime", term326641);
        setField(term326613, term326613.getClass(), "card", term326615);
        setField(term326613, term326613.getClass(), "userName", "hfzTDZlagT");
        setIntField(term326664, term326664.getClass(), "year", 2029);
        setShortField(term326664, term326664.getClass(), "month", (short) 4);
        setShortField(term326664, term326664.getClass(), "day", (short) 15);
        setField(term326663, term326663.getClass(), "date", term326664);
        setByteField(term326668, term326668.getClass(), "hour", (byte) 21);
        setByteField(term326668, term326668.getClass(), "minute", (byte) 43);
        setByteField(term326668, term326668.getClass(), "second", (byte) 21);
        setIntField(term326668, term326668.getClass(), "nano", 66054539);
        setField(term326663, term326663.getClass(), "time", term326668);
        setField(term326613, term326613.getClass(), "lastLoginDate", term326663);
        setBooleanField(term326613, term326613.getClass(), "isWebJoin", true);
        setField(term326613, term326613.getClass(), "webLimitDate", "QiQadgoFeJ");
        setIntField(term326613, term326613.getClass(), "level", -1844297547);
        setIntField(term326613, term326613.getClass(), "reincarnationNum", 1802451394);
        setField(term326613, term326613.getClass(), "exp", "MiQeaqHnsr");
        setLongField(term326613, term326613.getClass(), "point", -2195609154813833144L);
        setLongField(term326613, term326613.getClass(), "totalPoint", -4870790849054926111L);
        setIntField(term326613, term326613.getClass(), "playCount", -182890909);
        setIntField(term326613, term326613.getClass(), "multiPlayCount", -1032180019);
        setIntField(term326613, term326613.getClass(), "multiWinCount", -1616238764);
        setIntField(term326613, term326613.getClass(), "requestResCount", 1976896930);
        setIntField(term326613, term326613.getClass(), "acceptResCount", -1937263201);
        setIntField(term326613, term326613.getClass(), "successResCount", -25872721);
        setIntField(term326613, term326613.getClass(), "playerRating", 2005322577);
        setIntField(term326613, term326613.getClass(), "highestRating", -1186814529);
        setIntField(term326613, term326613.getClass(), "nameplateId", 1483573130);
        setIntField(term326613, term326613.getClass(), "frameId", 927223939);
        setIntField(term326613, term326613.getClass(), "characterId", -647830765);
        setIntField(term326613, term326613.getClass(), "trophyId", 2133854614);
        setIntField(term326613, term326613.getClass(), "playedTutorialBit", 2120820625);
        setIntField(term326613, term326613.getClass(), "firstTutorialCancelNum", 1775824914);
        setIntField(term326613, term326613.getClass(), "masterTutorialCancelNum", 131919044);
        setIntField(term326613, term326613.getClass(), "totalRepertoireCount", -1908209922);
        setIntField(term326613, term326613.getClass(), "totalMapNum", -831821447);
        setLongField(term326613, term326613.getClass(), "totalHiScore", 903724671589694521L);
        setLongField(term326613, term326613.getClass(), "totalBasicHighScore", 7585258225423451405L);
        setLongField(term326613, term326613.getClass(), "totalAdvancedHighScore", -175474244919865471L);
        setLongField(term326613, term326613.getClass(), "totalExpertHighScore", -5671896210054445569L);
        setLongField(term326613, term326613.getClass(), "totalMasterHighScore", 4341871498922510604L);
        setIntField(term326725, term326725.getClass(), "year", 2018);
        setShortField(term326725, term326725.getClass(), "month", (short) 2);
        setShortField(term326725, term326725.getClass(), "day", (short) 6);
        setField(term326724, term326724.getClass(), "date", term326725);
        setByteField(term326729, term326729.getClass(), "hour", (byte) 21);
        setByteField(term326729, term326729.getClass(), "minute", (byte) 54);
        setByteField(term326729, term326729.getClass(), "second", (byte) 42);
        setIntField(term326729, term326729.getClass(), "nano", 469250450);
        setField(term326724, term326724.getClass(), "time", term326729);
        setField(term326613, term326613.getClass(), "eventWatchedDate", term326724);
        setIntField(term326613, term326613.getClass(), "friendCount", 1071805713);
        setBooleanField(term326613, term326613.getClass(), "isMaimai", true);
        setField(term326613, term326613.getClass(), "firstGameId", "VPvnDPrxpV");
        setField(term326613, term326613.getClass(), "firstRomVersion", "snxtaDACxI");
        setField(term326613, term326613.getClass(), "firstDataVersion", "duHWXIEHJg");
        setIntField(term326773, term326773.getClass(), "year", 2012);
        setShortField(term326773, term326773.getClass(), "month", (short) 2);
        setShortField(term326773, term326773.getClass(), "day", (short) 7);
        setField(term326772, term326772.getClass(), "date", term326773);
        setByteField(term326777, term326777.getClass(), "hour", (byte) 3);
        setByteField(term326777, term326777.getClass(), "minute", (byte) 45);
        setByteField(term326777, term326777.getClass(), "second", (byte) 6);
        setIntField(term326777, term326777.getClass(), "nano", 731582353);
        setField(term326772, term326772.getClass(), "time", term326777);
        setField(term326613, term326613.getClass(), "firstPlayDate", term326772);
        setField(term326613, term326613.getClass(), "lastGameId", "ZIBJhPTjUC");
        setField(term326613, term326613.getClass(), "lastRomVersion", "HfVZfQLaid");
        setField(term326613, term326613.getClass(), "lastDataVersion", "oGqNndpbAv");
        setIntField(term326819, term326819.getClass(), "year", 2019);
        setShortField(term326819, term326819.getClass(), "month", (short) 9);
        setShortField(term326819, term326819.getClass(), "day", (short) 4);
        setField(term326818, term326818.getClass(), "date", term326819);
        setByteField(term326823, term326823.getClass(), "hour", (byte) 22);
        setByteField(term326823, term326823.getClass(), "minute", (byte) 56);
        setByteField(term326823, term326823.getClass(), "second", (byte) 35);
        setIntField(term326823, term326823.getClass(), "nano", 349562184);
        setField(term326818, term326818.getClass(), "time", term326823);
        setField(term326613, term326613.getClass(), "lastPlayDate", term326818);
        setIntField(term326613, term326613.getClass(), "lastPlaceId", -258014704);
        setField(term326613, term326613.getClass(), "lastPlaceName", "LKqZFyBPlu");
        setField(term326613, term326613.getClass(), "lastRegionId", "uAbRBIwjeP");
        setField(term326613, term326613.getClass(), "lastRegionName", "elwCYVqzgd");
        setField(term326613, term326613.getClass(), "lastAllNetId", "KpeLAmTSZv");
        setField(term326613, term326613.getClass(), "lastClientId", "oQHSSTasHn");
        setField(term326611, term326611.getClass(), "user", term326613);
        setIntField(term326611, term326611.getClass(), "ext1", 1010201759);
        setIntField(term326611, term326611.getClass(), "ext2", 47387847);
        setIntField(term326611, term326611.getClass(), "ext3", -339675979);
        setIntField(term326611, term326611.getClass(), "ext4", 541697068);
        setIntField(term326611, term326611.getClass(), "ext5", -942757980);
        setIntField(term326611, term326611.getClass(), "ext6", 1228061281);
        setIntField(term326611, term326611.getClass(), "ext7", 1306691725);
        setIntField(term326611, term326611.getClass(), "ext8", 57721881);
        setIntField(term326611, term326611.getClass(), "ext9", -256700241);
        setIntField(term326611, term326611.getClass(), "ext10", -1242840972);
        setIntField(term326611, term326611.getClass(), "ext11", 681981579);
        setIntField(term326611, term326611.getClass(), "ext12", 623545129);
        setIntField(term326611, term326611.getClass(), "ext13", 873477133);
        setIntField(term326611, term326611.getClass(), "ext14", -2112632680);
        setIntField(term326611, term326611.getClass(), "ext15", -167983517);
        setIntField(term326611, term326611.getClass(), "ext16", 631482306);
        setIntField(term326611, term326611.getClass(), "ext17", -1016827606);
        setIntField(term326611, term326611.getClass(), "ext18", -1832397774);
        setIntField(term326611, term326611.getClass(), "ext19", 2091980824);
        setIntField(term326611, term326611.getClass(), "ext20", 1881481825);
        term326909 = new Integer(437079367);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGameOptionEx");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term326909;
        callMethod(klass, "setExt13", argTypes, term326611, args);
    }

};


