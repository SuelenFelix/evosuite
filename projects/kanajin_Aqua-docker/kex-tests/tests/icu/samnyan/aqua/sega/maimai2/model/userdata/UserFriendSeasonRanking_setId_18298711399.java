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

public class UserFriendSeasonRanking_setId_18298711399 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20151;
     Object term20532;

    public UserFriendSeasonRanking_setId_18298711399() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term20157 = new Long(-484994522244390100L);
        Integer term20220 = new Integer(-1404350380);
        Integer term20222 = new Integer(-2013924238);
        Integer term20224 = new Integer(579006268);
        Integer term20226 = new Integer(-1694747156);
        Integer term20228 = new Integer(1466373988);
        ArrayList term20218 = new ArrayList();
        ((ArrayList) term20218).add(term20220);
        ((ArrayList) term20218).add(term20222);
        ((ArrayList) term20218).add(term20224);
        ((ArrayList) term20218).add(term20226);
        ((ArrayList) term20218).add(term20228);
        Integer term20234 = new Integer(-358526505);
        ArrayList term20232 = new ArrayList();
        ((ArrayList) term20232).add(term20234);
        term20151 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserFriendSeasonRanking"));
        Object term20153 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term20155 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term20171 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term20172 = newInstance(Class.forName("java.time.LocalDate"));
        Object term20176 = newInstance(Class.forName("java.time.LocalTime"));
        Object term20181 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term20182 = newInstance(Class.forName("java.time.LocalDate"));
        Object term20186 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term20151, term20151.getClass(), "id", 8505184530074334434L);
        setLongField(term20153, term20153.getClass(), "id", -1610129689783641208L);
        setLongField(term20155, term20155.getClass(), "id", -2613029888948149747L);
        setField(term20155, term20155.getClass(), "extId", term20157);
        setField(term20155, term20155.getClass(), "luid", "AdYzLPMcwe");
        setIntField(term20172, term20172.getClass(), "year", 2028);
        setShortField(term20172, term20172.getClass(), "month", (short) 4);
        setShortField(term20172, term20172.getClass(), "day", (short) 1);
        setField(term20171, term20171.getClass(), "date", term20172);
        setByteField(term20176, term20176.getClass(), "hour", (byte) 16);
        setByteField(term20176, term20176.getClass(), "minute", (byte) 22);
        setByteField(term20176, term20176.getClass(), "second", (byte) 32);
        setIntField(term20176, term20176.getClass(), "nano", 406353763);
        setField(term20171, term20171.getClass(), "time", term20176);
        setField(term20155, term20155.getClass(), "registerTime", term20171);
        setIntField(term20182, term20182.getClass(), "year", 2019);
        setShortField(term20182, term20182.getClass(), "month", (short) 7);
        setShortField(term20182, term20182.getClass(), "day", (short) 19);
        setField(term20181, term20181.getClass(), "date", term20182);
        setByteField(term20186, term20186.getClass(), "hour", (byte) 10);
        setByteField(term20186, term20186.getClass(), "minute", (byte) 54);
        setByteField(term20186, term20186.getClass(), "second", (byte) 55);
        setIntField(term20186, term20186.getClass(), "nano", 244650454);
        setField(term20181, term20181.getClass(), "time", term20186);
        setField(term20155, term20155.getClass(), "accessTime", term20181);
        setField(term20153, term20153.getClass(), "card", term20155);
        setField(term20153, term20153.getClass(), "userName", "FrTZLybkKk");
        setIntField(term20153, term20153.getClass(), "isNetMember", -134092543);
        setIntField(term20153, term20153.getClass(), "iconId", -1703642288);
        setIntField(term20153, term20153.getClass(), "plateId", 2075139747);
        setIntField(term20153, term20153.getClass(), "titleId", 2092881418);
        setIntField(term20153, term20153.getClass(), "partnerId", 1732410866);
        setIntField(term20153, term20153.getClass(), "frameId", 1084102599);
        setIntField(term20153, term20153.getClass(), "selectMapId", -1743503755);
        setIntField(term20153, term20153.getClass(), "totalAwake", 1641342112);
        setIntField(term20153, term20153.getClass(), "gradeRating", -1551790945);
        setIntField(term20153, term20153.getClass(), "musicRating", 2039538484);
        setIntField(term20153, term20153.getClass(), "playerRating", 1235736068);
        setIntField(term20153, term20153.getClass(), "highestRating", 329424176);
        setIntField(term20153, term20153.getClass(), "gradeRank", -1897199214);
        setIntField(term20153, term20153.getClass(), "classRank", -1016478729);
        setIntField(term20153, term20153.getClass(), "courseRank", -206889003);
        setField(term20153, term20153.getClass(), "charaSlot", term20218);
        setField(term20153, term20153.getClass(), "charaLockSlot", term20232);
        setLongField(term20153, term20153.getClass(), "contentBit", -6418282217428803693L);
        setIntField(term20153, term20153.getClass(), "playCount", 638046409);
        setField(term20153, term20153.getClass(), "eventWatchedDate", "FlxVmiMYKP");
        setField(term20153, term20153.getClass(), "lastGameId", "fgOpAWlGYN");
        setField(term20153, term20153.getClass(), "lastRomVersion", "PNzNzzjSXM");
        setField(term20153, term20153.getClass(), "lastDataVersion", "ktKcSZiuGM");
        setField(term20153, term20153.getClass(), "lastLoginDate", "PSOttyUeqv");
        setField(term20153, term20153.getClass(), "lastPlayDate", "HmEvTlmzXo");
        setIntField(term20153, term20153.getClass(), "lastPlayCredit", 427274898);
        setIntField(term20153, term20153.getClass(), "lastPlayMode", -1654552020);
        setIntField(term20153, term20153.getClass(), "lastPlaceId", -1049546692);
        setField(term20153, term20153.getClass(), "lastPlaceName", "BMMonTIZgJ");
        setIntField(term20153, term20153.getClass(), "lastAllNetId", 1397781598);
        setIntField(term20153, term20153.getClass(), "lastRegionId", -44720365);
        setField(term20153, term20153.getClass(), "lastRegionName", "QXyFXBjFde");
        setField(term20153, term20153.getClass(), "lastClientId", "xVFgeyYxZS");
        setField(term20153, term20153.getClass(), "lastCountryCode", "iQiGTulJiH");
        setIntField(term20153, term20153.getClass(), "lastSelectEMoney", 1963632911);
        setIntField(term20153, term20153.getClass(), "lastSelectTicket", -1100497683);
        setIntField(term20153, term20153.getClass(), "lastSelectCourse", 155423433);
        setIntField(term20153, term20153.getClass(), "lastCountCourse", -815471632);
        setField(term20153, term20153.getClass(), "firstGameId", "utCuuVCKqE");
        setField(term20153, term20153.getClass(), "firstRomVersion", "zSfoqzJbPT");
        setField(term20153, term20153.getClass(), "firstDataVersion", "QUymMnsCIj");
        setField(term20153, term20153.getClass(), "firstPlayDate", "ikTtOgdVYS");
        setField(term20153, term20153.getClass(), "compatibleCmVersion", "JptuwlirlS");
        setField(term20153, term20153.getClass(), "dailyBonusDate", "TKOMaGswbU");
        setField(term20153, term20153.getClass(), "dailyCourseBonusDate", "YcTbglHiUq");
        setField(term20153, term20153.getClass(), "lastPairLoginDate", "TiUqHrjoEU");
        setField(term20153, term20153.getClass(), "lastTrialPlayDate", "eoEvZbdLjL");
        setIntField(term20153, term20153.getClass(), "playVsCount", -1469668708);
        setIntField(term20153, term20153.getClass(), "playSyncCount", 1796950482);
        setIntField(term20153, term20153.getClass(), "winCount", -945759470);
        setIntField(term20153, term20153.getClass(), "helpCount", 657342039);
        setIntField(term20153, term20153.getClass(), "comboCount", 1483999606);
        setLongField(term20153, term20153.getClass(), "totalDeluxscore", -5608790408657117046L);
        setLongField(term20153, term20153.getClass(), "totalBasicDeluxscore", -6265886087280835813L);
        setLongField(term20153, term20153.getClass(), "totalAdvancedDeluxscore", 8408467837292297525L);
        setLongField(term20153, term20153.getClass(), "totalExpertDeluxscore", -5157976075409724332L);
        setLongField(term20153, term20153.getClass(), "totalMasterDeluxscore", 5638814204437933939L);
        setLongField(term20153, term20153.getClass(), "totalReMasterDeluxscore", -5717327658642389548L);
        setIntField(term20153, term20153.getClass(), "totalSync", 1871761182);
        setIntField(term20153, term20153.getClass(), "totalBasicSync", 233983728);
        setIntField(term20153, term20153.getClass(), "totalAdvancedSync", -1650132476);
        setIntField(term20153, term20153.getClass(), "totalExpertSync", 1719680265);
        setIntField(term20153, term20153.getClass(), "totalMasterSync", -1890898783);
        setIntField(term20153, term20153.getClass(), "totalReMasterSync", 1357632911);
        setLongField(term20153, term20153.getClass(), "totalAchievement", 8495724482241106293L);
        setLongField(term20153, term20153.getClass(), "totalBasicAchievement", -4318584834500248968L);
        setLongField(term20153, term20153.getClass(), "totalAdvancedAchievement", -7839957570751440706L);
        setLongField(term20153, term20153.getClass(), "totalExpertAchievement", -4944032768681866361L);
        setLongField(term20153, term20153.getClass(), "totalMasterAchievement", -6657309314982735134L);
        setLongField(term20153, term20153.getClass(), "totalReMasterAchievement", -685001356309682920L);
        setLongField(term20153, term20153.getClass(), "playerOldRating", -3189918180129674609L);
        setLongField(term20153, term20153.getClass(), "playerNewRating", 5271284328066798769L);
        setIntField(term20153, term20153.getClass(), "banState", 1768195761);
        setLongField(term20153, term20153.getClass(), "dateTime", 1924411240174876881L);
        setField(term20151, term20151.getClass(), "user", term20153);
        setIntField(term20151, term20151.getClass(), "seasonId", -1382661134);
        setIntField(term20151, term20151.getClass(), "point", -1042022818);
        setIntField(term20151, term20151.getClass(), "rank", 317372051);
        setBooleanField(term20151, term20151.getClass(), "rewardGet", false);
        setField(term20151, term20151.getClass(), "userName", "BkIxsyPkGy");
        setField(term20151, term20151.getClass(), "recordDate", "mrMGwoRgVY");
        term20532 = new Long(-8287954071414913487L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserFriendSeasonRanking");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term20532;
        callMethod(klass, "setId", argTypes, term20151, args);
    }

};


