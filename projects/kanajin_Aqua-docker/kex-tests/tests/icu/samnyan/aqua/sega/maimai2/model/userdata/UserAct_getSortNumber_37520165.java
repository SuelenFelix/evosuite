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

public class UserAct_getSortNumber_37520165 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2860;

    public UserAct_getSortNumber_37520165() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2866 = new Long(7411271909051562686L);
        Integer term2929 = new Integer(679763016);
        Integer term2931 = new Integer(1962444399);
        Integer term2933 = new Integer(767834723);
        Integer term2935 = new Integer(-602026508);
        Integer term2937 = new Integer(-157887805);
        Integer term2939 = new Integer(1876565163);
        ArrayList term2927 = new ArrayList();
        ((ArrayList) term2927).add(term2929);
        ((ArrayList) term2927).add(term2931);
        ((ArrayList) term2927).add(term2933);
        ((ArrayList) term2927).add(term2935);
        ((ArrayList) term2927).add(term2937);
        ((ArrayList) term2927).add(term2939);
        Integer term2945 = new Integer(-817164822);
        Integer term2947 = new Integer(-1016503459);
        Integer term2949 = new Integer(-1968847291);
        Integer term2951 = new Integer(579005622);
        Integer term2953 = new Integer(-14890619);
        ArrayList term2943 = new ArrayList();
        ((ArrayList) term2943).add(term2945);
        ((ArrayList) term2943).add(term2947);
        ((ArrayList) term2943).add(term2949);
        ((ArrayList) term2943).add(term2951);
        ((ArrayList) term2943).add(term2953);
        term2860 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserAct"));
        Object term2862 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term2864 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term2880 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2881 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2885 = newInstance(Class.forName("java.time.LocalTime"));
        Object term2890 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2891 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2895 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term2860, term2860.getClass(), "id", 1672578078364590450L);
        setLongField(term2862, term2862.getClass(), "id", 4949335493504695457L);
        setLongField(term2864, term2864.getClass(), "id", -5216789073301458893L);
        setField(term2864, term2864.getClass(), "extId", term2866);
        setField(term2864, term2864.getClass(), "luid", "qxSDVejjiY");
        setIntField(term2881, term2881.getClass(), "year", 2019);
        setShortField(term2881, term2881.getClass(), "month", (short) 2);
        setShortField(term2881, term2881.getClass(), "day", (short) 21);
        setField(term2880, term2880.getClass(), "date", term2881);
        setByteField(term2885, term2885.getClass(), "hour", (byte) 5);
        setByteField(term2885, term2885.getClass(), "minute", (byte) 41);
        setByteField(term2885, term2885.getClass(), "second", (byte) 11);
        setIntField(term2885, term2885.getClass(), "nano", 859829782);
        setField(term2880, term2880.getClass(), "time", term2885);
        setField(term2864, term2864.getClass(), "registerTime", term2880);
        setIntField(term2891, term2891.getClass(), "year", 2018);
        setShortField(term2891, term2891.getClass(), "month", (short) 9);
        setShortField(term2891, term2891.getClass(), "day", (short) 28);
        setField(term2890, term2890.getClass(), "date", term2891);
        setByteField(term2895, term2895.getClass(), "hour", (byte) 3);
        setByteField(term2895, term2895.getClass(), "minute", (byte) 37);
        setByteField(term2895, term2895.getClass(), "second", (byte) 46);
        setIntField(term2895, term2895.getClass(), "nano", 763326845);
        setField(term2890, term2890.getClass(), "time", term2895);
        setField(term2864, term2864.getClass(), "accessTime", term2890);
        setField(term2862, term2862.getClass(), "card", term2864);
        setField(term2862, term2862.getClass(), "userName", "xBsXSDjXYK");
        setIntField(term2862, term2862.getClass(), "isNetMember", -165587447);
        setIntField(term2862, term2862.getClass(), "iconId", -1347358701);
        setIntField(term2862, term2862.getClass(), "plateId", 806595993);
        setIntField(term2862, term2862.getClass(), "titleId", 548228925);
        setIntField(term2862, term2862.getClass(), "partnerId", -749861210);
        setIntField(term2862, term2862.getClass(), "frameId", 1694224101);
        setIntField(term2862, term2862.getClass(), "selectMapId", 937859191);
        setIntField(term2862, term2862.getClass(), "totalAwake", -916584829);
        setIntField(term2862, term2862.getClass(), "gradeRating", -2131181468);
        setIntField(term2862, term2862.getClass(), "musicRating", 282916351);
        setIntField(term2862, term2862.getClass(), "playerRating", 880977281);
        setIntField(term2862, term2862.getClass(), "highestRating", 371943306);
        setIntField(term2862, term2862.getClass(), "gradeRank", 982388293);
        setIntField(term2862, term2862.getClass(), "classRank", -159494544);
        setIntField(term2862, term2862.getClass(), "courseRank", -75206835);
        setField(term2862, term2862.getClass(), "charaSlot", term2927);
        setField(term2862, term2862.getClass(), "charaLockSlot", term2943);
        setLongField(term2862, term2862.getClass(), "contentBit", -1832940336320585644L);
        setIntField(term2862, term2862.getClass(), "playCount", -1618206977);
        setField(term2862, term2862.getClass(), "eventWatchedDate", "sEnIVFtZuQ");
        setField(term2862, term2862.getClass(), "lastGameId", "ZVecLZMLHF");
        setField(term2862, term2862.getClass(), "lastRomVersion", "fztQhjqwdP");
        setField(term2862, term2862.getClass(), "lastDataVersion", "eVpkWxjuki");
        setField(term2862, term2862.getClass(), "lastLoginDate", "SJiQaLvSKv");
        setField(term2862, term2862.getClass(), "lastPlayDate", "OEXDRUKcFl");
        setIntField(term2862, term2862.getClass(), "lastPlayCredit", -1747406163);
        setIntField(term2862, term2862.getClass(), "lastPlayMode", 388157121);
        setIntField(term2862, term2862.getClass(), "lastPlaceId", 1684998508);
        setField(term2862, term2862.getClass(), "lastPlaceName", "RYdKCNNMBR");
        setIntField(term2862, term2862.getClass(), "lastAllNetId", -1476644457);
        setIntField(term2862, term2862.getClass(), "lastRegionId", 1270666529);
        setField(term2862, term2862.getClass(), "lastRegionName", "yGtHPyvYiQ");
        setField(term2862, term2862.getClass(), "lastClientId", "MvRIxilFMJ");
        setField(term2862, term2862.getClass(), "lastCountryCode", "iNwOJRBEjp");
        setIntField(term2862, term2862.getClass(), "lastSelectEMoney", -1146679443);
        setIntField(term2862, term2862.getClass(), "lastSelectTicket", -860131894);
        setIntField(term2862, term2862.getClass(), "lastSelectCourse", -1022990421);
        setIntField(term2862, term2862.getClass(), "lastCountCourse", 1045547089);
        setField(term2862, term2862.getClass(), "firstGameId", "XylxrMBraH");
        setField(term2862, term2862.getClass(), "firstRomVersion", "pORebkoRdD");
        setField(term2862, term2862.getClass(), "firstDataVersion", "mXGCWJDOqA");
        setField(term2862, term2862.getClass(), "firstPlayDate", "dpNsDgfPso");
        setField(term2862, term2862.getClass(), "compatibleCmVersion", "hCWPJQKpdc");
        setField(term2862, term2862.getClass(), "dailyBonusDate", "WzMEhMXkKx");
        setField(term2862, term2862.getClass(), "dailyCourseBonusDate", "XOiDvlDhdc");
        setField(term2862, term2862.getClass(), "lastPairLoginDate", "AdxvLJhNLe");
        setField(term2862, term2862.getClass(), "lastTrialPlayDate", "lHfTrWKMPk");
        setIntField(term2862, term2862.getClass(), "playVsCount", -1122880881);
        setIntField(term2862, term2862.getClass(), "playSyncCount", -542712742);
        setIntField(term2862, term2862.getClass(), "winCount", -1254072822);
        setIntField(term2862, term2862.getClass(), "helpCount", -1111249833);
        setIntField(term2862, term2862.getClass(), "comboCount", -1692331299);
        setLongField(term2862, term2862.getClass(), "totalDeluxscore", -8033714905181142681L);
        setLongField(term2862, term2862.getClass(), "totalBasicDeluxscore", -9040825890007374809L);
        setLongField(term2862, term2862.getClass(), "totalAdvancedDeluxscore", 1368340889161782793L);
        setLongField(term2862, term2862.getClass(), "totalExpertDeluxscore", -5786861555969446503L);
        setLongField(term2862, term2862.getClass(), "totalMasterDeluxscore", 2354625302846375590L);
        setLongField(term2862, term2862.getClass(), "totalReMasterDeluxscore", 7276637106827860087L);
        setIntField(term2862, term2862.getClass(), "totalSync", 479531250);
        setIntField(term2862, term2862.getClass(), "totalBasicSync", 1320570890);
        setIntField(term2862, term2862.getClass(), "totalAdvancedSync", -130649791);
        setIntField(term2862, term2862.getClass(), "totalExpertSync", 534834644);
        setIntField(term2862, term2862.getClass(), "totalMasterSync", 1959097203);
        setIntField(term2862, term2862.getClass(), "totalReMasterSync", -209654048);
        setLongField(term2862, term2862.getClass(), "totalAchievement", -3936701866695933852L);
        setLongField(term2862, term2862.getClass(), "totalBasicAchievement", 1215116475929634177L);
        setLongField(term2862, term2862.getClass(), "totalAdvancedAchievement", 1597484336218508869L);
        setLongField(term2862, term2862.getClass(), "totalExpertAchievement", -685023850445639859L);
        setLongField(term2862, term2862.getClass(), "totalMasterAchievement", -6950146046121430355L);
        setLongField(term2862, term2862.getClass(), "totalReMasterAchievement", 1667122142089513324L);
        setLongField(term2862, term2862.getClass(), "playerOldRating", -6342139649364011743L);
        setLongField(term2862, term2862.getClass(), "playerNewRating", -4924950707540628022L);
        setIntField(term2862, term2862.getClass(), "banState", 477625804);
        setLongField(term2862, term2862.getClass(), "dateTime", -4393710401270724527L);
        setField(term2860, term2860.getClass(), "user", term2862);
        setIntField(term2860, term2860.getClass(), "kind", 252575029);
        setIntField(term2860, term2860.getClass(), "activityId", 57189932);
        setLongField(term2860, term2860.getClass(), "sortNumber", -4822736661741380518L);
        setIntField(term2860, term2860.getClass(), "param1", 1460722225);
        setIntField(term2860, term2860.getClass(), "param2", 1743224434);
        setIntField(term2860, term2860.getClass(), "param3", 842904495);
        setIntField(term2860, term2860.getClass(), "param4", 1008080511);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserAct");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSortNumber", argTypes, term2860, args);
    }

};


