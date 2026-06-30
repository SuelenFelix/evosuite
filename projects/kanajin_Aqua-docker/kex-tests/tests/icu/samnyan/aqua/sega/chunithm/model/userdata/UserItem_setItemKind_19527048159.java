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

public class UserItem_setItemKind_19527048159 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term125363;
     Object term125645;

    public UserItem_setItemKind_19527048159() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term125369 = new Long(1860789353508856614L);
        term125363 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserItem"));
        Object term125365 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term125367 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term125383 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term125384 = newInstance(Class.forName("java.time.LocalDate"));
        Object term125388 = newInstance(Class.forName("java.time.LocalTime"));
        Object term125393 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term125394 = newInstance(Class.forName("java.time.LocalDate"));
        Object term125398 = newInstance(Class.forName("java.time.LocalTime"));
        Object term125415 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term125416 = newInstance(Class.forName("java.time.LocalDate"));
        Object term125420 = newInstance(Class.forName("java.time.LocalTime"));
        Object term125476 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term125477 = newInstance(Class.forName("java.time.LocalDate"));
        Object term125481 = newInstance(Class.forName("java.time.LocalTime"));
        Object term125524 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term125525 = newInstance(Class.forName("java.time.LocalDate"));
        Object term125529 = newInstance(Class.forName("java.time.LocalTime"));
        Object term125570 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term125571 = newInstance(Class.forName("java.time.LocalDate"));
        Object term125575 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term125363, term125363.getClass(), "id", -2230737261489182178L);
        setLongField(term125365, term125365.getClass(), "id", -83935965733853204L);
        setLongField(term125367, term125367.getClass(), "id", -6117166524101089550L);
        setField(term125367, term125367.getClass(), "extId", term125369);
        setField(term125367, term125367.getClass(), "luid", "xSNRqymNqF");
        setIntField(term125384, term125384.getClass(), "year", 2029);
        setShortField(term125384, term125384.getClass(), "month", (short) 4);
        setShortField(term125384, term125384.getClass(), "day", (short) 2);
        setField(term125383, term125383.getClass(), "date", term125384);
        setByteField(term125388, term125388.getClass(), "hour", (byte) 0);
        setByteField(term125388, term125388.getClass(), "minute", (byte) 17);
        setByteField(term125388, term125388.getClass(), "second", (byte) 49);
        setIntField(term125388, term125388.getClass(), "nano", 285006166);
        setField(term125383, term125383.getClass(), "time", term125388);
        setField(term125367, term125367.getClass(), "registerTime", term125383);
        setIntField(term125394, term125394.getClass(), "year", 2012);
        setShortField(term125394, term125394.getClass(), "month", (short) 6);
        setShortField(term125394, term125394.getClass(), "day", (short) 12);
        setField(term125393, term125393.getClass(), "date", term125394);
        setByteField(term125398, term125398.getClass(), "hour", (byte) 0);
        setByteField(term125398, term125398.getClass(), "minute", (byte) 47);
        setByteField(term125398, term125398.getClass(), "second", (byte) 35);
        setIntField(term125398, term125398.getClass(), "nano", 111700489);
        setField(term125393, term125393.getClass(), "time", term125398);
        setField(term125367, term125367.getClass(), "accessTime", term125393);
        setField(term125365, term125365.getClass(), "card", term125367);
        setField(term125365, term125365.getClass(), "userName", "rswcpmelQS");
        setIntField(term125416, term125416.getClass(), "year", 2017);
        setShortField(term125416, term125416.getClass(), "month", (short) 11);
        setShortField(term125416, term125416.getClass(), "day", (short) 10);
        setField(term125415, term125415.getClass(), "date", term125416);
        setByteField(term125420, term125420.getClass(), "hour", (byte) 12);
        setByteField(term125420, term125420.getClass(), "minute", (byte) 10);
        setByteField(term125420, term125420.getClass(), "second", (byte) 3);
        setIntField(term125420, term125420.getClass(), "nano", 17839199);
        setField(term125415, term125415.getClass(), "time", term125420);
        setField(term125365, term125365.getClass(), "lastLoginDate", term125415);
        setBooleanField(term125365, term125365.getClass(), "isWebJoin", true);
        setField(term125365, term125365.getClass(), "webLimitDate", "OyCqSonMpX");
        setIntField(term125365, term125365.getClass(), "level", -55641764);
        setIntField(term125365, term125365.getClass(), "reincarnationNum", -2037807764);
        setField(term125365, term125365.getClass(), "exp", "iUUqZhloeC");
        setLongField(term125365, term125365.getClass(), "point", 2101866704361336078L);
        setLongField(term125365, term125365.getClass(), "totalPoint", 8493341625422825183L);
        setIntField(term125365, term125365.getClass(), "playCount", 1974397033);
        setIntField(term125365, term125365.getClass(), "multiPlayCount", 1265335644);
        setIntField(term125365, term125365.getClass(), "multiWinCount", -419899874);
        setIntField(term125365, term125365.getClass(), "requestResCount", 1798812338);
        setIntField(term125365, term125365.getClass(), "acceptResCount", 1746403267);
        setIntField(term125365, term125365.getClass(), "successResCount", 1970079675);
        setIntField(term125365, term125365.getClass(), "playerRating", 1835484929);
        setIntField(term125365, term125365.getClass(), "highestRating", 1666746585);
        setIntField(term125365, term125365.getClass(), "nameplateId", 1824603043);
        setIntField(term125365, term125365.getClass(), "frameId", -1528375664);
        setIntField(term125365, term125365.getClass(), "characterId", 2146550038);
        setIntField(term125365, term125365.getClass(), "trophyId", 660149075);
        setIntField(term125365, term125365.getClass(), "playedTutorialBit", 621137093);
        setIntField(term125365, term125365.getClass(), "firstTutorialCancelNum", -1420783838);
        setIntField(term125365, term125365.getClass(), "masterTutorialCancelNum", 1946952384);
        setIntField(term125365, term125365.getClass(), "totalRepertoireCount", 1505250876);
        setIntField(term125365, term125365.getClass(), "totalMapNum", -1719846831);
        setLongField(term125365, term125365.getClass(), "totalHiScore", -2269414119814498738L);
        setLongField(term125365, term125365.getClass(), "totalBasicHighScore", -7494870343001402650L);
        setLongField(term125365, term125365.getClass(), "totalAdvancedHighScore", -3147972350410788960L);
        setLongField(term125365, term125365.getClass(), "totalExpertHighScore", 4346251769204745723L);
        setLongField(term125365, term125365.getClass(), "totalMasterHighScore", 5888936271160716455L);
        setIntField(term125477, term125477.getClass(), "year", 2021);
        setShortField(term125477, term125477.getClass(), "month", (short) 2);
        setShortField(term125477, term125477.getClass(), "day", (short) 8);
        setField(term125476, term125476.getClass(), "date", term125477);
        setByteField(term125481, term125481.getClass(), "hour", (byte) 23);
        setByteField(term125481, term125481.getClass(), "minute", (byte) 30);
        setByteField(term125481, term125481.getClass(), "second", (byte) 59);
        setIntField(term125481, term125481.getClass(), "nano", 870549958);
        setField(term125476, term125476.getClass(), "time", term125481);
        setField(term125365, term125365.getClass(), "eventWatchedDate", term125476);
        setIntField(term125365, term125365.getClass(), "friendCount", -1206108814);
        setBooleanField(term125365, term125365.getClass(), "isMaimai", false);
        setField(term125365, term125365.getClass(), "firstGameId", "HGSlDwqOUA");
        setField(term125365, term125365.getClass(), "firstRomVersion", "snPorJFlwz");
        setField(term125365, term125365.getClass(), "firstDataVersion", "xEnedKycxs");
        setIntField(term125525, term125525.getClass(), "year", 2029);
        setShortField(term125525, term125525.getClass(), "month", (short) 2);
        setShortField(term125525, term125525.getClass(), "day", (short) 26);
        setField(term125524, term125524.getClass(), "date", term125525);
        setByteField(term125529, term125529.getClass(), "hour", (byte) 14);
        setByteField(term125529, term125529.getClass(), "minute", (byte) 14);
        setByteField(term125529, term125529.getClass(), "second", (byte) 21);
        setIntField(term125529, term125529.getClass(), "nano", 88227166);
        setField(term125524, term125524.getClass(), "time", term125529);
        setField(term125365, term125365.getClass(), "firstPlayDate", term125524);
        setField(term125365, term125365.getClass(), "lastGameId", "prYsWiRHjA");
        setField(term125365, term125365.getClass(), "lastRomVersion", "aQbBLDuBpT");
        setField(term125365, term125365.getClass(), "lastDataVersion", "lUpbmUdjAa");
        setIntField(term125571, term125571.getClass(), "year", 2023);
        setShortField(term125571, term125571.getClass(), "month", (short) 1);
        setShortField(term125571, term125571.getClass(), "day", (short) 24);
        setField(term125570, term125570.getClass(), "date", term125571);
        setByteField(term125575, term125575.getClass(), "hour", (byte) 9);
        setByteField(term125575, term125575.getClass(), "minute", (byte) 16);
        setByteField(term125575, term125575.getClass(), "second", (byte) 14);
        setIntField(term125575, term125575.getClass(), "nano", 590816672);
        setField(term125570, term125570.getClass(), "time", term125575);
        setField(term125365, term125365.getClass(), "lastPlayDate", term125570);
        setIntField(term125365, term125365.getClass(), "lastPlaceId", -1358098318);
        setField(term125365, term125365.getClass(), "lastPlaceName", "KPnQVYAkIf");
        setField(term125365, term125365.getClass(), "lastRegionId", "BrYcEZSDFU");
        setField(term125365, term125365.getClass(), "lastRegionName", "fXhQVbntXX");
        setField(term125365, term125365.getClass(), "lastAllNetId", "GdsYFhpAsv");
        setField(term125365, term125365.getClass(), "lastClientId", "JyeOfYxCgA");
        setField(term125363, term125363.getClass(), "user", term125365);
        setIntField(term125363, term125363.getClass(), "itemKind", -2002469421);
        setIntField(term125363, term125363.getClass(), "itemId", -1223226309);
        setIntField(term125363, term125363.getClass(), "stock", 1);
        setBooleanField(term125363, term125363.getClass(), "isValid", true);
        term125645 = new Integer(-2050753836);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserItem");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term125645;
        callMethod(klass, "setItemKind", argTypes, term125363, args);
    }

};


