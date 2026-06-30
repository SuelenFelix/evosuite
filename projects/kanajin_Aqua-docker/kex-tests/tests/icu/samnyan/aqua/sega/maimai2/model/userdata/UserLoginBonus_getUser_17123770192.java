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

public class UserLoginBonus_getUser_17123770192 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45036;

    public UserLoginBonus_getUser_17123770192() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term45042 = new Long(-8654565919063661957L);
        ArrayList term45103 = new ArrayList();
        Integer term45109 = new Integer(732174235);
        Integer term45111 = new Integer(470895808);
        Integer term45113 = new Integer(1787325291);
        Integer term45115 = new Integer(1470349147);
        Integer term45117 = new Integer(-255317272);
        Integer term45119 = new Integer(-706253892);
        Integer term45121 = new Integer(-1341439819);
        Integer term45123 = new Integer(-728760750);
        Integer term45125 = new Integer(-1617383807);
        ArrayList term45107 = new ArrayList();
        ((ArrayList) term45107).add(term45109);
        ((ArrayList) term45107).add(term45111);
        ((ArrayList) term45107).add(term45113);
        ((ArrayList) term45107).add(term45115);
        ((ArrayList) term45107).add(term45117);
        ((ArrayList) term45107).add(term45119);
        ((ArrayList) term45107).add(term45121);
        ((ArrayList) term45107).add(term45123);
        ((ArrayList) term45107).add(term45125);
        term45036 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserLoginBonus"));
        Object term45038 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term45040 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term45056 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term45057 = newInstance(Class.forName("java.time.LocalDate"));
        Object term45061 = newInstance(Class.forName("java.time.LocalTime"));
        Object term45066 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term45067 = newInstance(Class.forName("java.time.LocalDate"));
        Object term45071 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term45036, term45036.getClass(), "id", -8751837616810275039L);
        setLongField(term45038, term45038.getClass(), "id", -8676733724224510585L);
        setLongField(term45040, term45040.getClass(), "id", 1318139313166175279L);
        setField(term45040, term45040.getClass(), "extId", term45042);
        setField(term45040, term45040.getClass(), "luid", "pButgbcWlR");
        setIntField(term45057, term45057.getClass(), "year", 2010);
        setShortField(term45057, term45057.getClass(), "month", (short) 3);
        setShortField(term45057, term45057.getClass(), "day", (short) 11);
        setField(term45056, term45056.getClass(), "date", term45057);
        setByteField(term45061, term45061.getClass(), "hour", (byte) 0);
        setByteField(term45061, term45061.getClass(), "minute", (byte) 21);
        setByteField(term45061, term45061.getClass(), "second", (byte) 25);
        setIntField(term45061, term45061.getClass(), "nano", 201315999);
        setField(term45056, term45056.getClass(), "time", term45061);
        setField(term45040, term45040.getClass(), "registerTime", term45056);
        setIntField(term45067, term45067.getClass(), "year", 2016);
        setShortField(term45067, term45067.getClass(), "month", (short) 8);
        setShortField(term45067, term45067.getClass(), "day", (short) 24);
        setField(term45066, term45066.getClass(), "date", term45067);
        setByteField(term45071, term45071.getClass(), "hour", (byte) 22);
        setByteField(term45071, term45071.getClass(), "minute", (byte) 25);
        setByteField(term45071, term45071.getClass(), "second", (byte) 3);
        setIntField(term45071, term45071.getClass(), "nano", 185613519);
        setField(term45066, term45066.getClass(), "time", term45071);
        setField(term45040, term45040.getClass(), "accessTime", term45066);
        setField(term45038, term45038.getClass(), "card", term45040);
        setField(term45038, term45038.getClass(), "userName", "tPiZMhJIXj");
        setIntField(term45038, term45038.getClass(), "isNetMember", 873700519);
        setIntField(term45038, term45038.getClass(), "iconId", 805310057);
        setIntField(term45038, term45038.getClass(), "plateId", -107339699);
        setIntField(term45038, term45038.getClass(), "titleId", -58728001);
        setIntField(term45038, term45038.getClass(), "partnerId", 1013952192);
        setIntField(term45038, term45038.getClass(), "frameId", -986675483);
        setIntField(term45038, term45038.getClass(), "selectMapId", 337370099);
        setIntField(term45038, term45038.getClass(), "totalAwake", -824145581);
        setIntField(term45038, term45038.getClass(), "gradeRating", -769314399);
        setIntField(term45038, term45038.getClass(), "musicRating", -59737304);
        setIntField(term45038, term45038.getClass(), "playerRating", -1878753007);
        setIntField(term45038, term45038.getClass(), "highestRating", -411059650);
        setIntField(term45038, term45038.getClass(), "gradeRank", 811517871);
        setIntField(term45038, term45038.getClass(), "classRank", -74980095);
        setIntField(term45038, term45038.getClass(), "courseRank", -1303503886);
        setField(term45038, term45038.getClass(), "charaSlot", term45103);
        setField(term45038, term45038.getClass(), "charaLockSlot", term45107);
        setLongField(term45038, term45038.getClass(), "contentBit", 1712520441197520950L);
        setIntField(term45038, term45038.getClass(), "playCount", -199463835);
        setField(term45038, term45038.getClass(), "eventWatchedDate", "lrEkNimddJ");
        setField(term45038, term45038.getClass(), "lastGameId", "fkeYGEUxMA");
        setField(term45038, term45038.getClass(), "lastRomVersion", "aJUGPodUIW");
        setField(term45038, term45038.getClass(), "lastDataVersion", "NpjPDfnDRd");
        setField(term45038, term45038.getClass(), "lastLoginDate", "SWMYovqYdk");
        setField(term45038, term45038.getClass(), "lastPlayDate", "TQuvAoQcBe");
        setIntField(term45038, term45038.getClass(), "lastPlayCredit", 847764025);
        setIntField(term45038, term45038.getClass(), "lastPlayMode", 436004216);
        setIntField(term45038, term45038.getClass(), "lastPlaceId", 1327592820);
        setField(term45038, term45038.getClass(), "lastPlaceName", "nGYLfZrtWO");
        setIntField(term45038, term45038.getClass(), "lastAllNetId", 1056183374);
        setIntField(term45038, term45038.getClass(), "lastRegionId", 908916188);
        setField(term45038, term45038.getClass(), "lastRegionName", "DBufEhhBCQ");
        setField(term45038, term45038.getClass(), "lastClientId", "GiNZRBZjgO");
        setField(term45038, term45038.getClass(), "lastCountryCode", "ceGAKcClsG");
        setIntField(term45038, term45038.getClass(), "lastSelectEMoney", -2066943126);
        setIntField(term45038, term45038.getClass(), "lastSelectTicket", 670556171);
        setIntField(term45038, term45038.getClass(), "lastSelectCourse", -1727494705);
        setIntField(term45038, term45038.getClass(), "lastCountCourse", -1168439000);
        setField(term45038, term45038.getClass(), "firstGameId", "SEldZGJyvX");
        setField(term45038, term45038.getClass(), "firstRomVersion", "vyvpqcHTQN");
        setField(term45038, term45038.getClass(), "firstDataVersion", "QQcpNMSHvA");
        setField(term45038, term45038.getClass(), "firstPlayDate", "FLLklaMZvg");
        setField(term45038, term45038.getClass(), "compatibleCmVersion", "jRDZpkFkoD");
        setField(term45038, term45038.getClass(), "dailyBonusDate", "wwSknqIBIO");
        setField(term45038, term45038.getClass(), "dailyCourseBonusDate", "zQPAxUFaeX");
        setField(term45038, term45038.getClass(), "lastPairLoginDate", "cKNHUkrYfK");
        setField(term45038, term45038.getClass(), "lastTrialPlayDate", "crMeWqJOCQ");
        setIntField(term45038, term45038.getClass(), "playVsCount", -1552818345);
        setIntField(term45038, term45038.getClass(), "playSyncCount", -811708149);
        setIntField(term45038, term45038.getClass(), "winCount", 2060766727);
        setIntField(term45038, term45038.getClass(), "helpCount", 1298229635);
        setIntField(term45038, term45038.getClass(), "comboCount", -569196422);
        setLongField(term45038, term45038.getClass(), "totalDeluxscore", 7043650218274841102L);
        setLongField(term45038, term45038.getClass(), "totalBasicDeluxscore", -6096774034189525139L);
        setLongField(term45038, term45038.getClass(), "totalAdvancedDeluxscore", -6476891479972746312L);
        setLongField(term45038, term45038.getClass(), "totalExpertDeluxscore", -366973868174666045L);
        setLongField(term45038, term45038.getClass(), "totalMasterDeluxscore", -7657074490059876332L);
        setLongField(term45038, term45038.getClass(), "totalReMasterDeluxscore", -4773629433896348407L);
        setIntField(term45038, term45038.getClass(), "totalSync", -394638810);
        setIntField(term45038, term45038.getClass(), "totalBasicSync", 790706322);
        setIntField(term45038, term45038.getClass(), "totalAdvancedSync", 699712077);
        setIntField(term45038, term45038.getClass(), "totalExpertSync", -97640679);
        setIntField(term45038, term45038.getClass(), "totalMasterSync", 1484085042);
        setIntField(term45038, term45038.getClass(), "totalReMasterSync", 1777726456);
        setLongField(term45038, term45038.getClass(), "totalAchievement", -5187796980288712037L);
        setLongField(term45038, term45038.getClass(), "totalBasicAchievement", 238025331923627916L);
        setLongField(term45038, term45038.getClass(), "totalAdvancedAchievement", -6163417416099720642L);
        setLongField(term45038, term45038.getClass(), "totalExpertAchievement", -4498877698180346473L);
        setLongField(term45038, term45038.getClass(), "totalMasterAchievement", 4642147601851708039L);
        setLongField(term45038, term45038.getClass(), "totalReMasterAchievement", 1425489182033961019L);
        setLongField(term45038, term45038.getClass(), "playerOldRating", -884853141515650306L);
        setLongField(term45038, term45038.getClass(), "playerNewRating", 5063961949952053841L);
        setIntField(term45038, term45038.getClass(), "banState", -1376824764);
        setLongField(term45038, term45038.getClass(), "dateTime", 5946931662340995277L);
        setField(term45036, term45036.getClass(), "user", term45038);
        setIntField(term45036, term45036.getClass(), "bonusId", -1173622754);
        setIntField(term45036, term45036.getClass(), "point", -654564305);
        setBooleanField(term45036, term45036.getClass(), "isCurrent", true);
        setBooleanField(term45036, term45036.getClass(), "isComplete", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserLoginBonus");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUser", argTypes, term45036, args);
    }

};


