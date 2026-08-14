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

public class UserDetail_setTotalMasterSync_1773928669142 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term276456;
     Object term276801;

    public UserDetail_setTotalMasterSync_1773928669142() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term276460 = new Long(3831994970480278159L);
        Integer term276523 = new Integer(1198340749);
        Integer term276525 = new Integer(-385710681);
        Integer term276527 = new Integer(1624133267);
        ArrayList term276521 = new ArrayList();
        ((ArrayList) term276521).add(term276523);
        ((ArrayList) term276521).add(term276525);
        ((ArrayList) term276521).add(term276527);
        ArrayList term276531 = new ArrayList();
        term276456 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term276458 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term276474 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term276475 = newInstance(Class.forName("java.time.LocalDate"));
        Object term276479 = newInstance(Class.forName("java.time.LocalTime"));
        Object term276484 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term276485 = newInstance(Class.forName("java.time.LocalDate"));
        Object term276489 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term276456, term276456.getClass(), "id", 6276501829169735030L);
        setLongField(term276458, term276458.getClass(), "id", 2002485657434234699L);
        setField(term276458, term276458.getClass(), "extId", term276460);
        setField(term276458, term276458.getClass(), "luid", "kWvUnnYkTB");
        setIntField(term276475, term276475.getClass(), "year", 2017);
        setShortField(term276475, term276475.getClass(), "month", (short) 10);
        setShortField(term276475, term276475.getClass(), "day", (short) 4);
        setField(term276474, term276474.getClass(), "date", term276475);
        setByteField(term276479, term276479.getClass(), "hour", (byte) 1);
        setByteField(term276479, term276479.getClass(), "minute", (byte) 21);
        setByteField(term276479, term276479.getClass(), "second", (byte) 3);
        setIntField(term276479, term276479.getClass(), "nano", 164928538);
        setField(term276474, term276474.getClass(), "time", term276479);
        setField(term276458, term276458.getClass(), "registerTime", term276474);
        setIntField(term276485, term276485.getClass(), "year", 2014);
        setShortField(term276485, term276485.getClass(), "month", (short) 5);
        setShortField(term276485, term276485.getClass(), "day", (short) 12);
        setField(term276484, term276484.getClass(), "date", term276485);
        setByteField(term276489, term276489.getClass(), "hour", (byte) 21);
        setByteField(term276489, term276489.getClass(), "minute", (byte) 50);
        setByteField(term276489, term276489.getClass(), "second", (byte) 24);
        setIntField(term276489, term276489.getClass(), "nano", 165505767);
        setField(term276484, term276484.getClass(), "time", term276489);
        setField(term276458, term276458.getClass(), "accessTime", term276484);
        setField(term276456, term276456.getClass(), "card", term276458);
        setField(term276456, term276456.getClass(), "userName", "xUdwyFAEKn");
        setIntField(term276456, term276456.getClass(), "isNetMember", -1241638653);
        setIntField(term276456, term276456.getClass(), "iconId", -832082737);
        setIntField(term276456, term276456.getClass(), "plateId", 659361179);
        setIntField(term276456, term276456.getClass(), "titleId", 1762459373);
        setIntField(term276456, term276456.getClass(), "partnerId", 542713324);
        setIntField(term276456, term276456.getClass(), "frameId", 193960798);
        setIntField(term276456, term276456.getClass(), "selectMapId", -2096728827);
        setIntField(term276456, term276456.getClass(), "totalAwake", 1007899485);
        setIntField(term276456, term276456.getClass(), "gradeRating", 509496894);
        setIntField(term276456, term276456.getClass(), "musicRating", 1476111788);
        setIntField(term276456, term276456.getClass(), "playerRating", -718941728);
        setIntField(term276456, term276456.getClass(), "highestRating", 840842536);
        setIntField(term276456, term276456.getClass(), "gradeRank", -1271403609);
        setIntField(term276456, term276456.getClass(), "classRank", 1884294543);
        setIntField(term276456, term276456.getClass(), "courseRank", -1914952733);
        setField(term276456, term276456.getClass(), "charaSlot", term276521);
        setField(term276456, term276456.getClass(), "charaLockSlot", term276531);
        setLongField(term276456, term276456.getClass(), "contentBit", -3820686357923901479L);
        setIntField(term276456, term276456.getClass(), "playCount", -1988952578);
        setField(term276456, term276456.getClass(), "eventWatchedDate", "SKPObQHnYm");
        setField(term276456, term276456.getClass(), "lastGameId", "ZcUGgeWFzY");
        setField(term276456, term276456.getClass(), "lastRomVersion", "mPJNZAkiwl");
        setField(term276456, term276456.getClass(), "lastDataVersion", "RNQPquGEUU");
        setField(term276456, term276456.getClass(), "lastLoginDate", "KKEVepiIpV");
        setField(term276456, term276456.getClass(), "lastPlayDate", "acFpjOqFxM");
        setIntField(term276456, term276456.getClass(), "lastPlayCredit", -345409524);
        setIntField(term276456, term276456.getClass(), "lastPlayMode", -1574633469);
        setIntField(term276456, term276456.getClass(), "lastPlaceId", 1036189177);
        setField(term276456, term276456.getClass(), "lastPlaceName", "JKrIhwugSB");
        setIntField(term276456, term276456.getClass(), "lastAllNetId", 1117995815);
        setIntField(term276456, term276456.getClass(), "lastRegionId", -2022511335);
        setField(term276456, term276456.getClass(), "lastRegionName", "xfIshpKhxl");
        setField(term276456, term276456.getClass(), "lastClientId", "JwAMbyDsCd");
        setField(term276456, term276456.getClass(), "lastCountryCode", "jjiEzphWfP");
        setIntField(term276456, term276456.getClass(), "lastSelectEMoney", 51832928);
        setIntField(term276456, term276456.getClass(), "lastSelectTicket", -1340482712);
        setIntField(term276456, term276456.getClass(), "lastSelectCourse", 475577815);
        setIntField(term276456, term276456.getClass(), "lastCountCourse", 1808537592);
        setField(term276456, term276456.getClass(), "firstGameId", "vfJNCQdABx");
        setField(term276456, term276456.getClass(), "firstRomVersion", "UaOaphsPNu");
        setField(term276456, term276456.getClass(), "firstDataVersion", "PVNHLparYg");
        setField(term276456, term276456.getClass(), "firstPlayDate", "lVuSpxrheO");
        setField(term276456, term276456.getClass(), "compatibleCmVersion", "yqIHgqJlRm");
        setField(term276456, term276456.getClass(), "dailyBonusDate", "IdqtTIZzUa");
        setField(term276456, term276456.getClass(), "dailyCourseBonusDate", "mAkJuHJPpR");
        setField(term276456, term276456.getClass(), "lastPairLoginDate", "ibSKpbaZQm");
        setField(term276456, term276456.getClass(), "lastTrialPlayDate", "CZJQXVRezG");
        setIntField(term276456, term276456.getClass(), "playVsCount", -625276209);
        setIntField(term276456, term276456.getClass(), "playSyncCount", -912186570);
        setIntField(term276456, term276456.getClass(), "winCount", 332491973);
        setIntField(term276456, term276456.getClass(), "helpCount", 660268383);
        setIntField(term276456, term276456.getClass(), "comboCount", -671514118);
        setLongField(term276456, term276456.getClass(), "totalDeluxscore", -854823253852744966L);
        setLongField(term276456, term276456.getClass(), "totalBasicDeluxscore", 1085798628452779129L);
        setLongField(term276456, term276456.getClass(), "totalAdvancedDeluxscore", -4170068409437030484L);
        setLongField(term276456, term276456.getClass(), "totalExpertDeluxscore", -736987992347029085L);
        setLongField(term276456, term276456.getClass(), "totalMasterDeluxscore", 6797723526381445483L);
        setLongField(term276456, term276456.getClass(), "totalReMasterDeluxscore", -4840300996946705412L);
        setIntField(term276456, term276456.getClass(), "totalSync", -1399358009);
        setIntField(term276456, term276456.getClass(), "totalBasicSync", 2111728382);
        setIntField(term276456, term276456.getClass(), "totalAdvancedSync", 171174352);
        setIntField(term276456, term276456.getClass(), "totalExpertSync", -450601982);
        setIntField(term276456, term276456.getClass(), "totalMasterSync", 327442634);
        setIntField(term276456, term276456.getClass(), "totalReMasterSync", 1459640309);
        setLongField(term276456, term276456.getClass(), "totalAchievement", -3736180273027711550L);
        setLongField(term276456, term276456.getClass(), "totalBasicAchievement", -5055672306019923480L);
        setLongField(term276456, term276456.getClass(), "totalAdvancedAchievement", -2851624770745286712L);
        setLongField(term276456, term276456.getClass(), "totalExpertAchievement", 4494466723384748335L);
        setLongField(term276456, term276456.getClass(), "totalMasterAchievement", 4577752973261654109L);
        setLongField(term276456, term276456.getClass(), "totalReMasterAchievement", 6618700949721344734L);
        setLongField(term276456, term276456.getClass(), "playerOldRating", 6717372019266801331L);
        setLongField(term276456, term276456.getClass(), "playerNewRating", 7385820717788373355L);
        setIntField(term276456, term276456.getClass(), "banState", 296004124);
        setLongField(term276456, term276456.getClass(), "dateTime", -215484481109717744L);
        term276801 = new Integer(925831861);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term276801;
        callMethod(klass, "setTotalMasterSync", argTypes, term276456, args);
    }

};


