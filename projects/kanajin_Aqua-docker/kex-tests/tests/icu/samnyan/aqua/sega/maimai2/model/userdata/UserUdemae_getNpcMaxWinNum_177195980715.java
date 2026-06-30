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

public class UserUdemae_getNpcMaxWinNum_177195980715 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term103136;

    public UserUdemae_getNpcMaxWinNum_177195980715() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term103142 = new Long(-7291742736502427077L);
        Integer term103205 = new Integer(-1095121979);
        Integer term103207 = new Integer(-1674851914);
        Integer term103209 = new Integer(-1891353352);
        Integer term103211 = new Integer(113007640);
        Integer term103213 = new Integer(1782226794);
        Integer term103215 = new Integer(1115327577);
        ArrayList term103203 = new ArrayList();
        ((ArrayList) term103203).add(term103205);
        ((ArrayList) term103203).add(term103207);
        ((ArrayList) term103203).add(term103209);
        ((ArrayList) term103203).add(term103211);
        ((ArrayList) term103203).add(term103213);
        ((ArrayList) term103203).add(term103215);
        Integer term103221 = new Integer(840704993);
        Integer term103223 = new Integer(1297035285);
        Integer term103225 = new Integer(-826239685);
        Integer term103227 = new Integer(-845551243);
        ArrayList term103219 = new ArrayList();
        ((ArrayList) term103219).add(term103221);
        ((ArrayList) term103219).add(term103223);
        ((ArrayList) term103219).add(term103225);
        ((ArrayList) term103219).add(term103227);
        term103136 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserUdemae"));
        Object term103138 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term103140 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term103156 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term103157 = newInstance(Class.forName("java.time.LocalDate"));
        Object term103161 = newInstance(Class.forName("java.time.LocalTime"));
        Object term103166 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term103167 = newInstance(Class.forName("java.time.LocalDate"));
        Object term103171 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term103136, term103136.getClass(), "id", -5645042874196452363L);
        setLongField(term103138, term103138.getClass(), "id", 1089144432691396169L);
        setLongField(term103140, term103140.getClass(), "id", 6043571308877237179L);
        setField(term103140, term103140.getClass(), "extId", term103142);
        setField(term103140, term103140.getClass(), "luid", "ttkSFEAzwY");
        setIntField(term103157, term103157.getClass(), "year", 2022);
        setShortField(term103157, term103157.getClass(), "month", (short) 12);
        setShortField(term103157, term103157.getClass(), "day", (short) 22);
        setField(term103156, term103156.getClass(), "date", term103157);
        setByteField(term103161, term103161.getClass(), "hour", (byte) 18);
        setByteField(term103161, term103161.getClass(), "minute", (byte) 30);
        setByteField(term103161, term103161.getClass(), "second", (byte) 56);
        setIntField(term103161, term103161.getClass(), "nano", 111391416);
        setField(term103156, term103156.getClass(), "time", term103161);
        setField(term103140, term103140.getClass(), "registerTime", term103156);
        setIntField(term103167, term103167.getClass(), "year", 2019);
        setShortField(term103167, term103167.getClass(), "month", (short) 6);
        setShortField(term103167, term103167.getClass(), "day", (short) 22);
        setField(term103166, term103166.getClass(), "date", term103167);
        setByteField(term103171, term103171.getClass(), "hour", (byte) 9);
        setByteField(term103171, term103171.getClass(), "minute", (byte) 14);
        setByteField(term103171, term103171.getClass(), "second", (byte) 27);
        setIntField(term103171, term103171.getClass(), "nano", 124138657);
        setField(term103166, term103166.getClass(), "time", term103171);
        setField(term103140, term103140.getClass(), "accessTime", term103166);
        setField(term103138, term103138.getClass(), "card", term103140);
        setField(term103138, term103138.getClass(), "userName", "ZTUqSMjJHU");
        setIntField(term103138, term103138.getClass(), "isNetMember", -1544783703);
        setIntField(term103138, term103138.getClass(), "iconId", -1332726862);
        setIntField(term103138, term103138.getClass(), "plateId", 953524774);
        setIntField(term103138, term103138.getClass(), "titleId", 959188355);
        setIntField(term103138, term103138.getClass(), "partnerId", -1044212296);
        setIntField(term103138, term103138.getClass(), "frameId", -1818413689);
        setIntField(term103138, term103138.getClass(), "selectMapId", 1416082413);
        setIntField(term103138, term103138.getClass(), "totalAwake", 1462806642);
        setIntField(term103138, term103138.getClass(), "gradeRating", -1504046723);
        setIntField(term103138, term103138.getClass(), "musicRating", 842419931);
        setIntField(term103138, term103138.getClass(), "playerRating", 886819304);
        setIntField(term103138, term103138.getClass(), "highestRating", 639833326);
        setIntField(term103138, term103138.getClass(), "gradeRank", -884990158);
        setIntField(term103138, term103138.getClass(), "classRank", 765840331);
        setIntField(term103138, term103138.getClass(), "courseRank", 1089843929);
        setField(term103138, term103138.getClass(), "charaSlot", term103203);
        setField(term103138, term103138.getClass(), "charaLockSlot", term103219);
        setLongField(term103138, term103138.getClass(), "contentBit", 1857688668677867235L);
        setIntField(term103138, term103138.getClass(), "playCount", 1964061073);
        setField(term103138, term103138.getClass(), "eventWatchedDate", "TAvUGVCPaa");
        setField(term103138, term103138.getClass(), "lastGameId", "oacMptGUKE");
        setField(term103138, term103138.getClass(), "lastRomVersion", "vjVwvYdNhl");
        setField(term103138, term103138.getClass(), "lastDataVersion", "sqJqznmMco");
        setField(term103138, term103138.getClass(), "lastLoginDate", "ZufWIAjLXm");
        setField(term103138, term103138.getClass(), "lastPlayDate", "rXhBlGnTbp");
        setIntField(term103138, term103138.getClass(), "lastPlayCredit", -1274174342);
        setIntField(term103138, term103138.getClass(), "lastPlayMode", 269850713);
        setIntField(term103138, term103138.getClass(), "lastPlaceId", -1487569724);
        setField(term103138, term103138.getClass(), "lastPlaceName", "RXrliVaPrQ");
        setIntField(term103138, term103138.getClass(), "lastAllNetId", 288903600);
        setIntField(term103138, term103138.getClass(), "lastRegionId", -972943452);
        setField(term103138, term103138.getClass(), "lastRegionName", "QWnrSwmKgP");
        setField(term103138, term103138.getClass(), "lastClientId", "wOeJuAGSwi");
        setField(term103138, term103138.getClass(), "lastCountryCode", "lCalUsJPRJ");
        setIntField(term103138, term103138.getClass(), "lastSelectEMoney", -1263692965);
        setIntField(term103138, term103138.getClass(), "lastSelectTicket", 47709908);
        setIntField(term103138, term103138.getClass(), "lastSelectCourse", 1429392228);
        setIntField(term103138, term103138.getClass(), "lastCountCourse", 2122239536);
        setField(term103138, term103138.getClass(), "firstGameId", "gFHKkRGUax");
        setField(term103138, term103138.getClass(), "firstRomVersion", "paZAviFqsm");
        setField(term103138, term103138.getClass(), "firstDataVersion", "GohPpeqrRh");
        setField(term103138, term103138.getClass(), "firstPlayDate", "pfGxZUUbIW");
        setField(term103138, term103138.getClass(), "compatibleCmVersion", "GhZQSLeLeq");
        setField(term103138, term103138.getClass(), "dailyBonusDate", "vCJwFnMbeg");
        setField(term103138, term103138.getClass(), "dailyCourseBonusDate", "HiMyMWtfDT");
        setField(term103138, term103138.getClass(), "lastPairLoginDate", "bTxfZATYLW");
        setField(term103138, term103138.getClass(), "lastTrialPlayDate", "lFWdVTokyG");
        setIntField(term103138, term103138.getClass(), "playVsCount", 542088374);
        setIntField(term103138, term103138.getClass(), "playSyncCount", -950297218);
        setIntField(term103138, term103138.getClass(), "winCount", 1244123877);
        setIntField(term103138, term103138.getClass(), "helpCount", -1662703727);
        setIntField(term103138, term103138.getClass(), "comboCount", 1279906508);
        setLongField(term103138, term103138.getClass(), "totalDeluxscore", -1175329770645054224L);
        setLongField(term103138, term103138.getClass(), "totalBasicDeluxscore", -8641861887771020491L);
        setLongField(term103138, term103138.getClass(), "totalAdvancedDeluxscore", 6610508350585809711L);
        setLongField(term103138, term103138.getClass(), "totalExpertDeluxscore", -8793140099009782071L);
        setLongField(term103138, term103138.getClass(), "totalMasterDeluxscore", 6032322064040415926L);
        setLongField(term103138, term103138.getClass(), "totalReMasterDeluxscore", -4408222906457582842L);
        setIntField(term103138, term103138.getClass(), "totalSync", -238375706);
        setIntField(term103138, term103138.getClass(), "totalBasicSync", 1556952863);
        setIntField(term103138, term103138.getClass(), "totalAdvancedSync", -198148044);
        setIntField(term103138, term103138.getClass(), "totalExpertSync", 1022014258);
        setIntField(term103138, term103138.getClass(), "totalMasterSync", -125889150);
        setIntField(term103138, term103138.getClass(), "totalReMasterSync", 1022350206);
        setLongField(term103138, term103138.getClass(), "totalAchievement", 7298722086104684L);
        setLongField(term103138, term103138.getClass(), "totalBasicAchievement", -4391657012610556206L);
        setLongField(term103138, term103138.getClass(), "totalAdvancedAchievement", 4233874350901096997L);
        setLongField(term103138, term103138.getClass(), "totalExpertAchievement", 4153899405411550335L);
        setLongField(term103138, term103138.getClass(), "totalMasterAchievement", 3959114672373605667L);
        setLongField(term103138, term103138.getClass(), "totalReMasterAchievement", 1102968285448626659L);
        setLongField(term103138, term103138.getClass(), "playerOldRating", 6853911867658043615L);
        setLongField(term103138, term103138.getClass(), "playerNewRating", 1320878772738094792L);
        setIntField(term103138, term103138.getClass(), "banState", -171751232);
        setLongField(term103138, term103138.getClass(), "dateTime", 6709908432613210121L);
        setField(term103136, term103136.getClass(), "user", term103138);
        setIntField(term103136, term103136.getClass(), "rate", -999681370);
        setIntField(term103136, term103136.getClass(), "maxRate", 1143545597);
        setIntField(term103136, term103136.getClass(), "classValue", 1949354764);
        setIntField(term103136, term103136.getClass(), "maxClassValue", -1317200481);
        setIntField(term103136, term103136.getClass(), "totalWinNum", -229302209);
        setIntField(term103136, term103136.getClass(), "totalLoseNum", -1214413475);
        setIntField(term103136, term103136.getClass(), "maxWinNum", 351461566);
        setIntField(term103136, term103136.getClass(), "maxLoseNum", -745219395);
        setIntField(term103136, term103136.getClass(), "winNum", 1205528550);
        setIntField(term103136, term103136.getClass(), "loseNum", -1936901017);
        setIntField(term103136, term103136.getClass(), "npcTotalWinNum", -1504411382);
        setIntField(term103136, term103136.getClass(), "npcTotalLoseNum", -283531377);
        setIntField(term103136, term103136.getClass(), "npcMaxWinNum", -314963964);
        setIntField(term103136, term103136.getClass(), "npcMaxLoseNum", 1047233857);
        setIntField(term103136, term103136.getClass(), "npcWinNum", 180900029);
        setIntField(term103136, term103136.getClass(), "npcLoseNum", 1084899159);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserUdemae");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNpcMaxWinNum", argTypes, term103136, args);
    }

};


