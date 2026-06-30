package icu.samnyan.aqua.sega.maimai2.model.userdata;

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
import static icu.samnyan.aqua.sega.maimai2.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;
import java.util.ArrayList;
import java.lang.Integer;

public class UserMusicDetail_setSyncStatus_52256302018 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term65952;
     Object term66311;

    public UserMusicDetail_setSyncStatus_52256302018() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term65958 = new Long(-5786861555969446503L);
        Integer term66021 = new Integer(-1368173231);
        Integer term66023 = new Integer(1956006038);
        ArrayList term66019 = new ArrayList();
        ((ArrayList) term66019).add(term66021);
        ((ArrayList) term66019).add(term66023);
        Integer term66029 = new Integer(-1062304878);
        Integer term66031 = new Integer(-1377876610);
        Integer term66033 = new Integer(-1456184732);
        ArrayList term66027 = new ArrayList();
        ((ArrayList) term66027).add(term66029);
        ((ArrayList) term66027).add(term66031);
        ((ArrayList) term66027).add(term66033);
        term65952 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserMusicDetail"));
        Object term65954 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term65956 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term65972 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term65973 = newInstance(Class.forName("java.time.LocalDate"));
        Object term65977 = newInstance(Class.forName("java.time.LocalTime"));
        Object term65982 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term65983 = newInstance(Class.forName("java.time.LocalDate"));
        Object term65987 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term65952, term65952.getClass(), "id", -3954441930739441319L);
        setLongField(term65954, term65954.getClass(), "id", -5840925148221311102L);
        setLongField(term65956, term65956.getClass(), "id", -4208738507614245483L);
        setField(term65956, term65956.getClass(), "extId", term65958);
        setField(term65956, term65956.getClass(), "luid", "aDEuPKrSZt");
        setIntField(term65973, term65973.getClass(), "year", 2028);
        setShortField(term65973, term65973.getClass(), "month", (short) 2);
        setShortField(term65973, term65973.getClass(), "day", (short) 8);
        setField(term65972, term65972.getClass(), "date", term65973);
        setByteField(term65977, term65977.getClass(), "hour", (byte) 16);
        setByteField(term65977, term65977.getClass(), "minute", (byte) 14);
        setByteField(term65977, term65977.getClass(), "second", (byte) 31);
        setIntField(term65977, term65977.getClass(), "nano", 824823232);
        setField(term65972, term65972.getClass(), "time", term65977);
        setField(term65956, term65956.getClass(), "registerTime", term65972);
        setIntField(term65983, term65983.getClass(), "year", 2018);
        setShortField(term65983, term65983.getClass(), "month", (short) 9);
        setShortField(term65983, term65983.getClass(), "day", (short) 8);
        setField(term65982, term65982.getClass(), "date", term65983);
        setByteField(term65987, term65987.getClass(), "hour", (byte) 14);
        setByteField(term65987, term65987.getClass(), "minute", (byte) 21);
        setByteField(term65987, term65987.getClass(), "second", (byte) 23);
        setIntField(term65987, term65987.getClass(), "nano", 316911941);
        setField(term65982, term65982.getClass(), "time", term65987);
        setField(term65956, term65956.getClass(), "accessTime", term65982);
        setField(term65954, term65954.getClass(), "card", term65956);
        setField(term65954, term65954.getClass(), "userName", "aDhkmoCCUK");
        setIntField(term65954, term65954.getClass(), "isNetMember", -1965076703);
        setIntField(term65954, term65954.getClass(), "iconId", -1715006566);
        setIntField(term65954, term65954.getClass(), "plateId", 1190377243);
        setIntField(term65954, term65954.getClass(), "titleId", -1013321277);
        setIntField(term65954, term65954.getClass(), "partnerId", -38762037);
        setIntField(term65954, term65954.getClass(), "frameId", -200236986);
        setIntField(term65954, term65954.getClass(), "selectMapId", -1078778523);
        setIntField(term65954, term65954.getClass(), "totalAwake", -1573140874);
        setIntField(term65954, term65954.getClass(), "gradeRating", 1252740231);
        setIntField(term65954, term65954.getClass(), "musicRating", -1494498996);
        setIntField(term65954, term65954.getClass(), "playerRating", -1230782196);
        setIntField(term65954, term65954.getClass(), "highestRating", 1988646780);
        setIntField(term65954, term65954.getClass(), "gradeRank", -1505639058);
        setIntField(term65954, term65954.getClass(), "classRank", -1198622469);
        setIntField(term65954, term65954.getClass(), "courseRank", 254477121);
        setField(term65954, term65954.getClass(), "charaSlot", term66019);
        setField(term65954, term65954.getClass(), "charaLockSlot", term66027);
        setLongField(term65954, term65954.getClass(), "contentBit", -7979131537588306481L);
        setIntField(term65954, term65954.getClass(), "playCount", -2097473055);
        setField(term65954, term65954.getClass(), "eventWatchedDate", "ibnuoVVkVm");
        setField(term65954, term65954.getClass(), "lastGameId", "mXVgkxjTjD");
        setField(term65954, term65954.getClass(), "lastRomVersion", "qodBmKUkev");
        setField(term65954, term65954.getClass(), "lastDataVersion", "QJuqwUQEyr");
        setField(term65954, term65954.getClass(), "lastLoginDate", "qqUAzxxpNB");
        setField(term65954, term65954.getClass(), "lastPlayDate", "WqaQxuPbzr");
        setIntField(term65954, term65954.getClass(), "lastPlayCredit", 956173467);
        setIntField(term65954, term65954.getClass(), "lastPlayMode", -362299700);
        setIntField(term65954, term65954.getClass(), "lastPlaceId", -229025947);
        setField(term65954, term65954.getClass(), "lastPlaceName", "bjLZqJqmnv");
        setIntField(term65954, term65954.getClass(), "lastAllNetId", -2074615511);
        setIntField(term65954, term65954.getClass(), "lastRegionId", -545948451);
        setField(term65954, term65954.getClass(), "lastRegionName", "TPbMBzbcHs");
        setField(term65954, term65954.getClass(), "lastClientId", "spkDvqsOhJ");
        setField(term65954, term65954.getClass(), "lastCountryCode", "faFVBESzWc");
        setIntField(term65954, term65954.getClass(), "lastSelectEMoney", -211944434);
        setIntField(term65954, term65954.getClass(), "lastSelectTicket", -558856994);
        setIntField(term65954, term65954.getClass(), "lastSelectCourse", 329934484);
        setIntField(term65954, term65954.getClass(), "lastCountCourse", 575431591);
        setField(term65954, term65954.getClass(), "firstGameId", "baFwYJAfPz");
        setField(term65954, term65954.getClass(), "firstRomVersion", "PxBSOwkatN");
        setField(term65954, term65954.getClass(), "firstDataVersion", "uKjlgaHcoc");
        setField(term65954, term65954.getClass(), "firstPlayDate", "ITJMSWaPGZ");
        setField(term65954, term65954.getClass(), "compatibleCmVersion", "ivvEvcUacU");
        setField(term65954, term65954.getClass(), "dailyBonusDate", "gbSukHPGfP");
        setField(term65954, term65954.getClass(), "dailyCourseBonusDate", "jEDnJjwhoo");
        setField(term65954, term65954.getClass(), "lastPairLoginDate", "TkTHRRicKc");
        setField(term65954, term65954.getClass(), "lastTrialPlayDate", "xwBoTnuoQg");
        setIntField(term65954, term65954.getClass(), "playVsCount", 912666310);
        setIntField(term65954, term65954.getClass(), "playSyncCount", 302408238);
        setIntField(term65954, term65954.getClass(), "winCount", -685735773);
        setIntField(term65954, term65954.getClass(), "helpCount", -1229964213);
        setIntField(term65954, term65954.getClass(), "comboCount", -206580016);
        setLongField(term65954, term65954.getClass(), "totalDeluxscore", 1914754471514802967L);
        setLongField(term65954, term65954.getClass(), "totalBasicDeluxscore", 2773198289980268296L);
        setLongField(term65954, term65954.getClass(), "totalAdvancedDeluxscore", 632360974898166826L);
        setLongField(term65954, term65954.getClass(), "totalExpertDeluxscore", -4867174099943207188L);
        setLongField(term65954, term65954.getClass(), "totalMasterDeluxscore", -6992366326063551384L);
        setLongField(term65954, term65954.getClass(), "totalReMasterDeluxscore", -257489281168692227L);
        setIntField(term65954, term65954.getClass(), "totalSync", -982047423);
        setIntField(term65954, term65954.getClass(), "totalBasicSync", -1580085541);
        setIntField(term65954, term65954.getClass(), "totalAdvancedSync", -1151473049);
        setIntField(term65954, term65954.getClass(), "totalExpertSync", 1472205129);
        setIntField(term65954, term65954.getClass(), "totalMasterSync", -289676027);
        setIntField(term65954, term65954.getClass(), "totalReMasterSync", 1248845256);
        setLongField(term65954, term65954.getClass(), "totalAchievement", -3201501634740088518L);
        setLongField(term65954, term65954.getClass(), "totalBasicAchievement", -2456846159547925075L);
        setLongField(term65954, term65954.getClass(), "totalAdvancedAchievement", 5303304865916931742L);
        setLongField(term65954, term65954.getClass(), "totalExpertAchievement", 3743553196561690809L);
        setLongField(term65954, term65954.getClass(), "totalMasterAchievement", -4100683915919317973L);
        setLongField(term65954, term65954.getClass(), "totalReMasterAchievement", -4411561243835140657L);
        setLongField(term65954, term65954.getClass(), "playerOldRating", 8046359617233364561L);
        setLongField(term65954, term65954.getClass(), "playerNewRating", -1294722164117772682L);
        setIntField(term65954, term65954.getClass(), "banState", 229418911);
        setLongField(term65954, term65954.getClass(), "dateTime", -7742919499730303003L);
        setField(term65952, term65952.getClass(), "user", term65954);
        setIntField(term65952, term65952.getClass(), "musicId", -1130854864);
        setIntField(term65952, term65952.getClass(), "level", 1114579008);
        setIntField(term65952, term65952.getClass(), "playCount", 1460012868);
        setIntField(term65952, term65952.getClass(), "achievement", -2073192308);
        setIntField(term65952, term65952.getClass(), "comboStatus", -2085811126);
        setIntField(term65952, term65952.getClass(), "syncStatus", -2129502819);
        setIntField(term65952, term65952.getClass(), "deluxscoreMax", -1063218440);
        setIntField(term65952, term65952.getClass(), "scoreRank", -688177933);
        term66311 = new Integer(-566941881);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserMusicDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term66311;
        callMethod(klass, "setSyncStatus", argTypes, term65952, args);
    }

};


