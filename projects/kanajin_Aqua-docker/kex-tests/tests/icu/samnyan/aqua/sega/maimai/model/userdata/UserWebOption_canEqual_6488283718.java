package icu.samnyan.aqua.sega.maimai.model.userdata;

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
import static icu.samnyan.aqua.sega.maimai.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;

public class UserWebOption_canEqual_6488283718 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42428;
     Object term42610;

    public UserWebOption_canEqual_6488283718() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term42434 = new Long(-2924531382671518368L);
        term42428 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserWebOption"));
        Object term42430 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term42432 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term42448 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term42449 = newInstance(Class.forName("java.time.LocalDate"));
        Object term42453 = newInstance(Class.forName("java.time.LocalTime"));
        Object term42458 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term42459 = newInstance(Class.forName("java.time.LocalDate"));
        Object term42463 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term42428, term42428.getClass(), "id", -532956263280568707L);
        setLongField(term42430, term42430.getClass(), "id", 6073193746616629086L);
        setLongField(term42432, term42432.getClass(), "id", -2463629530824341661L);
        setField(term42432, term42432.getClass(), "extId", term42434);
        setField(term42432, term42432.getClass(), "luid", "ulKaKnANzj");
        setIntField(term42449, term42449.getClass(), "year", 2010);
        setShortField(term42449, term42449.getClass(), "month", (short) 11);
        setShortField(term42449, term42449.getClass(), "day", (short) 14);
        setField(term42448, term42448.getClass(), "date", term42449);
        setByteField(term42453, term42453.getClass(), "hour", (byte) 4);
        setByteField(term42453, term42453.getClass(), "minute", (byte) 49);
        setByteField(term42453, term42453.getClass(), "second", (byte) 50);
        setIntField(term42453, term42453.getClass(), "nano", 621399921);
        setField(term42448, term42448.getClass(), "time", term42453);
        setField(term42432, term42432.getClass(), "registerTime", term42448);
        setIntField(term42459, term42459.getClass(), "year", 2027);
        setShortField(term42459, term42459.getClass(), "month", (short) 1);
        setShortField(term42459, term42459.getClass(), "day", (short) 20);
        setField(term42458, term42458.getClass(), "date", term42459);
        setByteField(term42463, term42463.getClass(), "hour", (byte) 8);
        setByteField(term42463, term42463.getClass(), "minute", (byte) 5);
        setByteField(term42463, term42463.getClass(), "second", (byte) 44);
        setIntField(term42463, term42463.getClass(), "nano", 960768267);
        setField(term42458, term42458.getClass(), "time", term42463);
        setField(term42432, term42432.getClass(), "accessTime", term42458);
        setField(term42430, term42430.getClass(), "card", term42432);
        setIntField(term42430, term42430.getClass(), "lastDataVersion", 2141886355);
        setField(term42430, term42430.getClass(), "userName", "ABwhdjjeJi");
        setIntField(term42430, term42430.getClass(), "point", -979489727);
        setIntField(term42430, term42430.getClass(), "totalPoint", -1339607020);
        setIntField(term42430, term42430.getClass(), "iconId", 21710763);
        setIntField(term42430, term42430.getClass(), "nameplateId", -1638359261);
        setIntField(term42430, term42430.getClass(), "frameId", -1738702221);
        setIntField(term42430, term42430.getClass(), "trophyId", 949696394);
        setIntField(term42430, term42430.getClass(), "playCount", 366195895);
        setIntField(term42430, term42430.getClass(), "playVsCount", 513276394);
        setIntField(term42430, term42430.getClass(), "playSyncCount", -867492502);
        setIntField(term42430, term42430.getClass(), "winCount", 1315160763);
        setIntField(term42430, term42430.getClass(), "helpCount", -806163944);
        setIntField(term42430, term42430.getClass(), "comboCount", -1528700295);
        setIntField(term42430, term42430.getClass(), "feverCount", -92750221);
        setIntField(term42430, term42430.getClass(), "totalHiScore", 1994324228);
        setIntField(term42430, term42430.getClass(), "totalEasyHighScore", 1551084552);
        setIntField(term42430, term42430.getClass(), "totalBasicHighScore", 1435658339);
        setIntField(term42430, term42430.getClass(), "totalAdvancedHighScore", 1802290366);
        setIntField(term42430, term42430.getClass(), "totalExpertHighScore", -1308723047);
        setIntField(term42430, term42430.getClass(), "totalMasterHighScore", -1225238765);
        setIntField(term42430, term42430.getClass(), "totalReMasterHighScore", -546245327);
        setIntField(term42430, term42430.getClass(), "totalHighSync", 1671823678);
        setIntField(term42430, term42430.getClass(), "totalEasySync", -1929941351);
        setIntField(term42430, term42430.getClass(), "totalBasicSync", -137121647);
        setIntField(term42430, term42430.getClass(), "totalAdvancedSync", 503819416);
        setIntField(term42430, term42430.getClass(), "totalExpertSync", -1959893804);
        setIntField(term42430, term42430.getClass(), "totalMasterSync", -983886756);
        setIntField(term42430, term42430.getClass(), "totalReMasterSync", 662682481);
        setIntField(term42430, term42430.getClass(), "playerRating", 51649517);
        setIntField(term42430, term42430.getClass(), "highestRating", -416813909);
        setIntField(term42430, term42430.getClass(), "rankAuthTailId", -894882289);
        setField(term42430, term42430.getClass(), "eventWatchedDate", "KKEcpYXNZV");
        setField(term42430, term42430.getClass(), "webLimitDate", "shLHFznysy");
        setIntField(term42430, term42430.getClass(), "challengeTrackPhase", 270964023);
        setIntField(term42430, term42430.getClass(), "firstPlayBits", -66130728);
        setField(term42430, term42430.getClass(), "lastPlayDate", "YCKIloBHLj");
        setIntField(term42430, term42430.getClass(), "lastPlaceId", -720277275);
        setField(term42430, term42430.getClass(), "lastPlaceName", "qUWDhAeFJY");
        setIntField(term42430, term42430.getClass(), "lastRegionId", 1131634307);
        setField(term42430, term42430.getClass(), "lastRegionName", "wboNBMhRjP");
        setField(term42430, term42430.getClass(), "lastClientId", "HZODpafOGe");
        setField(term42430, term42430.getClass(), "lastCountryCode", "dUTYEKtTfQ");
        setIntField(term42430, term42430.getClass(), "eventPoint", -898785465);
        setIntField(term42430, term42430.getClass(), "totalLv", 1852804936);
        setIntField(term42430, term42430.getClass(), "lastLoginBonusDay", 53950838);
        setIntField(term42430, term42430.getClass(), "lastSurvivalBonusDay", -180263871);
        setIntField(term42430, term42430.getClass(), "loginBonusLv", 787708003);
        setField(term42428, term42428.getClass(), "user", term42430);
        setBooleanField(term42428, term42428.getClass(), "isNetMember", true);
        setIntField(term42428, term42428.getClass(), "dispRate", -1238626650);
        setIntField(term42428, term42428.getClass(), "dispJudgeStyle", 1251835216);
        setIntField(term42428, term42428.getClass(), "dispRank", -1462529055);
        setIntField(term42428, term42428.getClass(), "dispHomeRanker", 1576372849);
        setIntField(term42428, term42428.getClass(), "dispTotalLv", 1296336460);
        term42610 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserWebOption");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term42610;
        callMethod(klass, "canEqual", argTypes, term42428, args);
    }

};


