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

public class UserLoginBonus_setBonusId_8992160159 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49670;
     Object term50029;

    public UserLoginBonus_setBonusId_8992160159() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term49676 = new Long(9013624480170062917L);
        Integer term49739 = new Integer(1038029515);
        Integer term49741 = new Integer(1137154606);
        Integer term49743 = new Integer(-100681578);
        Integer term49745 = new Integer(296568835);
        Integer term49747 = new Integer(1431951992);
        Integer term49749 = new Integer(-1608123016);
        ArrayList term49737 = new ArrayList();
        ((ArrayList) term49737).add(term49739);
        ((ArrayList) term49737).add(term49741);
        ((ArrayList) term49737).add(term49743);
        ((ArrayList) term49737).add(term49745);
        ((ArrayList) term49737).add(term49747);
        ((ArrayList) term49737).add(term49749);
        Integer term49755 = new Integer(-896473214);
        ArrayList term49753 = new ArrayList();
        ((ArrayList) term49753).add(term49755);
        term49670 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserLoginBonus"));
        Object term49672 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term49674 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term49690 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term49691 = newInstance(Class.forName("java.time.LocalDate"));
        Object term49695 = newInstance(Class.forName("java.time.LocalTime"));
        Object term49700 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term49701 = newInstance(Class.forName("java.time.LocalDate"));
        Object term49705 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term49670, term49670.getClass(), "id", -4019650338948804968L);
        setLongField(term49672, term49672.getClass(), "id", 4836157943217062601L);
        setLongField(term49674, term49674.getClass(), "id", -9063283724358706942L);
        setField(term49674, term49674.getClass(), "extId", term49676);
        setField(term49674, term49674.getClass(), "luid", "KkgJnxXxVl");
        setIntField(term49691, term49691.getClass(), "year", 2023);
        setShortField(term49691, term49691.getClass(), "month", (short) 7);
        setShortField(term49691, term49691.getClass(), "day", (short) 27);
        setField(term49690, term49690.getClass(), "date", term49691);
        setByteField(term49695, term49695.getClass(), "hour", (byte) 4);
        setByteField(term49695, term49695.getClass(), "minute", (byte) 25);
        setByteField(term49695, term49695.getClass(), "second", (byte) 46);
        setIntField(term49695, term49695.getClass(), "nano", 646465452);
        setField(term49690, term49690.getClass(), "time", term49695);
        setField(term49674, term49674.getClass(), "registerTime", term49690);
        setIntField(term49701, term49701.getClass(), "year", 2022);
        setShortField(term49701, term49701.getClass(), "month", (short) 11);
        setShortField(term49701, term49701.getClass(), "day", (short) 2);
        setField(term49700, term49700.getClass(), "date", term49701);
        setByteField(term49705, term49705.getClass(), "hour", (byte) 4);
        setByteField(term49705, term49705.getClass(), "minute", (byte) 14);
        setByteField(term49705, term49705.getClass(), "second", (byte) 5);
        setIntField(term49705, term49705.getClass(), "nano", 604465127);
        setField(term49700, term49700.getClass(), "time", term49705);
        setField(term49674, term49674.getClass(), "accessTime", term49700);
        setField(term49672, term49672.getClass(), "card", term49674);
        setField(term49672, term49672.getClass(), "userName", "TGnzPlGFMb");
        setIntField(term49672, term49672.getClass(), "isNetMember", -1242612066);
        setIntField(term49672, term49672.getClass(), "iconId", -1492896610);
        setIntField(term49672, term49672.getClass(), "plateId", 1239212151);
        setIntField(term49672, term49672.getClass(), "titleId", 1513817979);
        setIntField(term49672, term49672.getClass(), "partnerId", 222944981);
        setIntField(term49672, term49672.getClass(), "frameId", -1880135720);
        setIntField(term49672, term49672.getClass(), "selectMapId", 1065058113);
        setIntField(term49672, term49672.getClass(), "totalAwake", 159521199);
        setIntField(term49672, term49672.getClass(), "gradeRating", 2020510924);
        setIntField(term49672, term49672.getClass(), "musicRating", -644848160);
        setIntField(term49672, term49672.getClass(), "playerRating", -413768483);
        setIntField(term49672, term49672.getClass(), "highestRating", 565614678);
        setIntField(term49672, term49672.getClass(), "gradeRank", -1248504675);
        setIntField(term49672, term49672.getClass(), "classRank", 1366246744);
        setIntField(term49672, term49672.getClass(), "courseRank", -369295588);
        setField(term49672, term49672.getClass(), "charaSlot", term49737);
        setField(term49672, term49672.getClass(), "charaLockSlot", term49753);
        setLongField(term49672, term49672.getClass(), "contentBit", -8579515460152917650L);
        setIntField(term49672, term49672.getClass(), "playCount", 728215296);
        setField(term49672, term49672.getClass(), "eventWatchedDate", "yEvLMSpdHy");
        setField(term49672, term49672.getClass(), "lastGameId", "qdErlZeTVv");
        setField(term49672, term49672.getClass(), "lastRomVersion", "OCCDQbndDE");
        setField(term49672, term49672.getClass(), "lastDataVersion", "NMANMKfctU");
        setField(term49672, term49672.getClass(), "lastLoginDate", "mQsaqUltLU");
        setField(term49672, term49672.getClass(), "lastPlayDate", "jwENwZiGlR");
        setIntField(term49672, term49672.getClass(), "lastPlayCredit", -1236147031);
        setIntField(term49672, term49672.getClass(), "lastPlayMode", 2030051112);
        setIntField(term49672, term49672.getClass(), "lastPlaceId", 1023614449);
        setField(term49672, term49672.getClass(), "lastPlaceName", "rfFHGPcfpz");
        setIntField(term49672, term49672.getClass(), "lastAllNetId", -717220010);
        setIntField(term49672, term49672.getClass(), "lastRegionId", 280068573);
        setField(term49672, term49672.getClass(), "lastRegionName", "fViQeyMrrL");
        setField(term49672, term49672.getClass(), "lastClientId", "zzeaToyLmI");
        setField(term49672, term49672.getClass(), "lastCountryCode", "sKYWhmRMLx");
        setIntField(term49672, term49672.getClass(), "lastSelectEMoney", -1081530515);
        setIntField(term49672, term49672.getClass(), "lastSelectTicket", 492096339);
        setIntField(term49672, term49672.getClass(), "lastSelectCourse", -1679827671);
        setIntField(term49672, term49672.getClass(), "lastCountCourse", 932019255);
        setField(term49672, term49672.getClass(), "firstGameId", "SOJpgWUZCf");
        setField(term49672, term49672.getClass(), "firstRomVersion", "jgywFOzBDw");
        setField(term49672, term49672.getClass(), "firstDataVersion", "yKIXLtCWYi");
        setField(term49672, term49672.getClass(), "firstPlayDate", "EhuyRKrUJu");
        setField(term49672, term49672.getClass(), "compatibleCmVersion", "UlBxuoBXcJ");
        setField(term49672, term49672.getClass(), "dailyBonusDate", "PqduvNFXXw");
        setField(term49672, term49672.getClass(), "dailyCourseBonusDate", "bMQrxvaBAI");
        setField(term49672, term49672.getClass(), "lastPairLoginDate", "StFtysZlWm");
        setField(term49672, term49672.getClass(), "lastTrialPlayDate", "CoqUcmjnkF");
        setIntField(term49672, term49672.getClass(), "playVsCount", 1939661233);
        setIntField(term49672, term49672.getClass(), "playSyncCount", -485147289);
        setIntField(term49672, term49672.getClass(), "winCount", -1098526777);
        setIntField(term49672, term49672.getClass(), "helpCount", 871491464);
        setIntField(term49672, term49672.getClass(), "comboCount", 1250354269);
        setLongField(term49672, term49672.getClass(), "totalDeluxscore", -3033236171719733686L);
        setLongField(term49672, term49672.getClass(), "totalBasicDeluxscore", 2458513029160061715L);
        setLongField(term49672, term49672.getClass(), "totalAdvancedDeluxscore", 8528564099162820842L);
        setLongField(term49672, term49672.getClass(), "totalExpertDeluxscore", -1931621459457925623L);
        setLongField(term49672, term49672.getClass(), "totalMasterDeluxscore", -947267660485940099L);
        setLongField(term49672, term49672.getClass(), "totalReMasterDeluxscore", -1329447485805427573L);
        setIntField(term49672, term49672.getClass(), "totalSync", 695748317);
        setIntField(term49672, term49672.getClass(), "totalBasicSync", -439470959);
        setIntField(term49672, term49672.getClass(), "totalAdvancedSync", -248472453);
        setIntField(term49672, term49672.getClass(), "totalExpertSync", 1056759659);
        setIntField(term49672, term49672.getClass(), "totalMasterSync", -233313895);
        setIntField(term49672, term49672.getClass(), "totalReMasterSync", 2014416586);
        setLongField(term49672, term49672.getClass(), "totalAchievement", -2298075900308676256L);
        setLongField(term49672, term49672.getClass(), "totalBasicAchievement", -32504336313564415L);
        setLongField(term49672, term49672.getClass(), "totalAdvancedAchievement", -3072149709226785130L);
        setLongField(term49672, term49672.getClass(), "totalExpertAchievement", -539562950566320509L);
        setLongField(term49672, term49672.getClass(), "totalMasterAchievement", -6590502822258678292L);
        setLongField(term49672, term49672.getClass(), "totalReMasterAchievement", 707619162419050395L);
        setLongField(term49672, term49672.getClass(), "playerOldRating", -2742794200189356451L);
        setLongField(term49672, term49672.getClass(), "playerNewRating", 784504767592240462L);
        setIntField(term49672, term49672.getClass(), "banState", 1614071253);
        setLongField(term49672, term49672.getClass(), "dateTime", -2000525962887472969L);
        setField(term49670, term49670.getClass(), "user", term49672);
        setIntField(term49670, term49670.getClass(), "bonusId", -548611489);
        setIntField(term49670, term49670.getClass(), "point", 792588182);
        setBooleanField(term49670, term49670.getClass(), "isCurrent", false);
        setBooleanField(term49670, term49670.getClass(), "isComplete", true);
        term50029 = new Integer(1145540785);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserLoginBonus");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term50029;
        callMethod(klass, "setBonusId", argTypes, term49670, args);
    }

};


