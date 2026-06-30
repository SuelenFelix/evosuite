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

public class UserDetail_setTotalMasterSync_1773928669143 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term276511;
     Object term276856;

    public UserDetail_setTotalMasterSync_1773928669143() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term276515 = new Long(3831994970480278159L);
        Integer term276578 = new Integer(1198340749);
        Integer term276580 = new Integer(-385710681);
        Integer term276582 = new Integer(1624133267);
        ArrayList term276576 = new ArrayList();
        ((ArrayList) term276576).add(term276578);
        ((ArrayList) term276576).add(term276580);
        ((ArrayList) term276576).add(term276582);
        ArrayList term276586 = new ArrayList();
        term276511 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term276513 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term276529 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term276530 = newInstance(Class.forName("java.time.LocalDate"));
        Object term276534 = newInstance(Class.forName("java.time.LocalTime"));
        Object term276539 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term276540 = newInstance(Class.forName("java.time.LocalDate"));
        Object term276544 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term276511, term276511.getClass(), "id", 6276501829169735030L);
        setLongField(term276513, term276513.getClass(), "id", 2002485657434234699L);
        setField(term276513, term276513.getClass(), "extId", term276515);
        setField(term276513, term276513.getClass(), "luid", "kWvUnnYkTB");
        setIntField(term276530, term276530.getClass(), "year", 2017);
        setShortField(term276530, term276530.getClass(), "month", (short) 10);
        setShortField(term276530, term276530.getClass(), "day", (short) 4);
        setField(term276529, term276529.getClass(), "date", term276530);
        setByteField(term276534, term276534.getClass(), "hour", (byte) 1);
        setByteField(term276534, term276534.getClass(), "minute", (byte) 21);
        setByteField(term276534, term276534.getClass(), "second", (byte) 3);
        setIntField(term276534, term276534.getClass(), "nano", 164928538);
        setField(term276529, term276529.getClass(), "time", term276534);
        setField(term276513, term276513.getClass(), "registerTime", term276529);
        setIntField(term276540, term276540.getClass(), "year", 2014);
        setShortField(term276540, term276540.getClass(), "month", (short) 5);
        setShortField(term276540, term276540.getClass(), "day", (short) 12);
        setField(term276539, term276539.getClass(), "date", term276540);
        setByteField(term276544, term276544.getClass(), "hour", (byte) 21);
        setByteField(term276544, term276544.getClass(), "minute", (byte) 50);
        setByteField(term276544, term276544.getClass(), "second", (byte) 24);
        setIntField(term276544, term276544.getClass(), "nano", 165505767);
        setField(term276539, term276539.getClass(), "time", term276544);
        setField(term276513, term276513.getClass(), "accessTime", term276539);
        setField(term276511, term276511.getClass(), "card", term276513);
        setField(term276511, term276511.getClass(), "userName", "xUdwyFAEKn");
        setIntField(term276511, term276511.getClass(), "isNetMember", -1241638653);
        setIntField(term276511, term276511.getClass(), "iconId", -832082737);
        setIntField(term276511, term276511.getClass(), "plateId", 659361179);
        setIntField(term276511, term276511.getClass(), "titleId", 1762459373);
        setIntField(term276511, term276511.getClass(), "partnerId", 542713324);
        setIntField(term276511, term276511.getClass(), "frameId", 193960798);
        setIntField(term276511, term276511.getClass(), "selectMapId", -2096728827);
        setIntField(term276511, term276511.getClass(), "totalAwake", 1007899485);
        setIntField(term276511, term276511.getClass(), "gradeRating", 509496894);
        setIntField(term276511, term276511.getClass(), "musicRating", 1476111788);
        setIntField(term276511, term276511.getClass(), "playerRating", -718941728);
        setIntField(term276511, term276511.getClass(), "highestRating", 840842536);
        setIntField(term276511, term276511.getClass(), "gradeRank", -1271403609);
        setIntField(term276511, term276511.getClass(), "classRank", 1884294543);
        setIntField(term276511, term276511.getClass(), "courseRank", -1914952733);
        setField(term276511, term276511.getClass(), "charaSlot", term276576);
        setField(term276511, term276511.getClass(), "charaLockSlot", term276586);
        setLongField(term276511, term276511.getClass(), "contentBit", -3820686357923901479L);
        setIntField(term276511, term276511.getClass(), "playCount", -1988952578);
        setField(term276511, term276511.getClass(), "eventWatchedDate", "SKPObQHnYm");
        setField(term276511, term276511.getClass(), "lastGameId", "ZcUGgeWFzY");
        setField(term276511, term276511.getClass(), "lastRomVersion", "mPJNZAkiwl");
        setField(term276511, term276511.getClass(), "lastDataVersion", "RNQPquGEUU");
        setField(term276511, term276511.getClass(), "lastLoginDate", "KKEVepiIpV");
        setField(term276511, term276511.getClass(), "lastPlayDate", "acFpjOqFxM");
        setIntField(term276511, term276511.getClass(), "lastPlayCredit", -345409524);
        setIntField(term276511, term276511.getClass(), "lastPlayMode", -1574633469);
        setIntField(term276511, term276511.getClass(), "lastPlaceId", 1036189177);
        setField(term276511, term276511.getClass(), "lastPlaceName", "JKrIhwugSB");
        setIntField(term276511, term276511.getClass(), "lastAllNetId", 1117995815);
        setIntField(term276511, term276511.getClass(), "lastRegionId", -2022511335);
        setField(term276511, term276511.getClass(), "lastRegionName", "xfIshpKhxl");
        setField(term276511, term276511.getClass(), "lastClientId", "JwAMbyDsCd");
        setField(term276511, term276511.getClass(), "lastCountryCode", "jjiEzphWfP");
        setIntField(term276511, term276511.getClass(), "lastSelectEMoney", 51832928);
        setIntField(term276511, term276511.getClass(), "lastSelectTicket", -1340482712);
        setIntField(term276511, term276511.getClass(), "lastSelectCourse", 475577815);
        setIntField(term276511, term276511.getClass(), "lastCountCourse", 1808537592);
        setField(term276511, term276511.getClass(), "firstGameId", "vfJNCQdABx");
        setField(term276511, term276511.getClass(), "firstRomVersion", "UaOaphsPNu");
        setField(term276511, term276511.getClass(), "firstDataVersion", "PVNHLparYg");
        setField(term276511, term276511.getClass(), "firstPlayDate", "lVuSpxrheO");
        setField(term276511, term276511.getClass(), "compatibleCmVersion", "yqIHgqJlRm");
        setField(term276511, term276511.getClass(), "dailyBonusDate", "IdqtTIZzUa");
        setField(term276511, term276511.getClass(), "dailyCourseBonusDate", "mAkJuHJPpR");
        setField(term276511, term276511.getClass(), "lastPairLoginDate", "ibSKpbaZQm");
        setField(term276511, term276511.getClass(), "lastTrialPlayDate", "CZJQXVRezG");
        setIntField(term276511, term276511.getClass(), "playVsCount", -625276209);
        setIntField(term276511, term276511.getClass(), "playSyncCount", -912186570);
        setIntField(term276511, term276511.getClass(), "winCount", 332491973);
        setIntField(term276511, term276511.getClass(), "helpCount", 660268383);
        setIntField(term276511, term276511.getClass(), "comboCount", -671514118);
        setLongField(term276511, term276511.getClass(), "totalDeluxscore", -854823253852744966L);
        setLongField(term276511, term276511.getClass(), "totalBasicDeluxscore", 1085798628452779129L);
        setLongField(term276511, term276511.getClass(), "totalAdvancedDeluxscore", -4170068409437030484L);
        setLongField(term276511, term276511.getClass(), "totalExpertDeluxscore", -736987992347029085L);
        setLongField(term276511, term276511.getClass(), "totalMasterDeluxscore", 6797723526381445483L);
        setLongField(term276511, term276511.getClass(), "totalReMasterDeluxscore", -4840300996946705412L);
        setIntField(term276511, term276511.getClass(), "totalSync", -1399358009);
        setIntField(term276511, term276511.getClass(), "totalBasicSync", 2111728382);
        setIntField(term276511, term276511.getClass(), "totalAdvancedSync", 171174352);
        setIntField(term276511, term276511.getClass(), "totalExpertSync", -450601982);
        setIntField(term276511, term276511.getClass(), "totalMasterSync", 327442634);
        setIntField(term276511, term276511.getClass(), "totalReMasterSync", 1459640309);
        setLongField(term276511, term276511.getClass(), "totalAchievement", -3736180273027711550L);
        setLongField(term276511, term276511.getClass(), "totalBasicAchievement", -5055672306019923480L);
        setLongField(term276511, term276511.getClass(), "totalAdvancedAchievement", -2851624770745286712L);
        setLongField(term276511, term276511.getClass(), "totalExpertAchievement", 4494466723384748335L);
        setLongField(term276511, term276511.getClass(), "totalMasterAchievement", 4577752973261654109L);
        setLongField(term276511, term276511.getClass(), "totalReMasterAchievement", 6618700949721344734L);
        setLongField(term276511, term276511.getClass(), "playerOldRating", 6717372019266801331L);
        setLongField(term276511, term276511.getClass(), "playerNewRating", 7385820717788373355L);
        setIntField(term276511, term276511.getClass(), "banState", 296004124);
        setLongField(term276511, term276511.getClass(), "dateTime", -215484481109717744L);
        term276856 = new Integer(925831861);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term276856;
        callMethod(klass, "setTotalMasterSync", argTypes, term276511, args);
    }

};


