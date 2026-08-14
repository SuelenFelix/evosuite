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

public class UserDetail_getTotalSync_60247630361 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term230107;

    public UserDetail_getTotalSync_60247630361() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term230111 = new Long(-5004803270846838598L);
        ArrayList term230172 = new ArrayList();
        ArrayList term230176 = new ArrayList();
        term230107 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term230109 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term230125 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term230126 = newInstance(Class.forName("java.time.LocalDate"));
        Object term230130 = newInstance(Class.forName("java.time.LocalTime"));
        Object term230135 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term230136 = newInstance(Class.forName("java.time.LocalDate"));
        Object term230140 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term230107, term230107.getClass(), "id", -268890584351402081L);
        setLongField(term230109, term230109.getClass(), "id", -978448106392119367L);
        setField(term230109, term230109.getClass(), "extId", term230111);
        setField(term230109, term230109.getClass(), "luid", "yjaHcOpjcZ");
        setIntField(term230126, term230126.getClass(), "year", 2020);
        setShortField(term230126, term230126.getClass(), "month", (short) 2);
        setShortField(term230126, term230126.getClass(), "day", (short) 28);
        setField(term230125, term230125.getClass(), "date", term230126);
        setByteField(term230130, term230130.getClass(), "hour", (byte) 3);
        setByteField(term230130, term230130.getClass(), "minute", (byte) 46);
        setByteField(term230130, term230130.getClass(), "second", (byte) 58);
        setIntField(term230130, term230130.getClass(), "nano", 519279868);
        setField(term230125, term230125.getClass(), "time", term230130);
        setField(term230109, term230109.getClass(), "registerTime", term230125);
        setIntField(term230136, term230136.getClass(), "year", 2028);
        setShortField(term230136, term230136.getClass(), "month", (short) 8);
        setShortField(term230136, term230136.getClass(), "day", (short) 27);
        setField(term230135, term230135.getClass(), "date", term230136);
        setByteField(term230140, term230140.getClass(), "hour", (byte) 5);
        setByteField(term230140, term230140.getClass(), "minute", (byte) 50);
        setByteField(term230140, term230140.getClass(), "second", (byte) 39);
        setIntField(term230140, term230140.getClass(), "nano", 452455240);
        setField(term230135, term230135.getClass(), "time", term230140);
        setField(term230109, term230109.getClass(), "accessTime", term230135);
        setField(term230107, term230107.getClass(), "card", term230109);
        setField(term230107, term230107.getClass(), "userName", "oZYHhFZGXx");
        setIntField(term230107, term230107.getClass(), "isNetMember", -1308727775);
        setIntField(term230107, term230107.getClass(), "iconId", 923435355);
        setIntField(term230107, term230107.getClass(), "plateId", 529707862);
        setIntField(term230107, term230107.getClass(), "titleId", 1163541549);
        setIntField(term230107, term230107.getClass(), "partnerId", 85255563);
        setIntField(term230107, term230107.getClass(), "frameId", 1698224861);
        setIntField(term230107, term230107.getClass(), "selectMapId", -1675006092);
        setIntField(term230107, term230107.getClass(), "totalAwake", -71395930);
        setIntField(term230107, term230107.getClass(), "gradeRating", -1327988712);
        setIntField(term230107, term230107.getClass(), "musicRating", -481078842);
        setIntField(term230107, term230107.getClass(), "playerRating", 133257591);
        setIntField(term230107, term230107.getClass(), "highestRating", -171155321);
        setIntField(term230107, term230107.getClass(), "gradeRank", -677950072);
        setIntField(term230107, term230107.getClass(), "classRank", -904761728);
        setIntField(term230107, term230107.getClass(), "courseRank", 2000897549);
        setField(term230107, term230107.getClass(), "charaSlot", term230172);
        setField(term230107, term230107.getClass(), "charaLockSlot", term230176);
        setLongField(term230107, term230107.getClass(), "contentBit", -3528336609655788551L);
        setIntField(term230107, term230107.getClass(), "playCount", 1826955502);
        setField(term230107, term230107.getClass(), "eventWatchedDate", "DRDfOzZyDb");
        setField(term230107, term230107.getClass(), "lastGameId", "FMSzTGVPul");
        setField(term230107, term230107.getClass(), "lastRomVersion", "qSFkTIyPfh");
        setField(term230107, term230107.getClass(), "lastDataVersion", "tbYTpFYzqZ");
        setField(term230107, term230107.getClass(), "lastLoginDate", "BNLfzlakIC");
        setField(term230107, term230107.getClass(), "lastPlayDate", "nzqaGEtJND");
        setIntField(term230107, term230107.getClass(), "lastPlayCredit", -757144818);
        setIntField(term230107, term230107.getClass(), "lastPlayMode", 519574863);
        setIntField(term230107, term230107.getClass(), "lastPlaceId", 1696650503);
        setField(term230107, term230107.getClass(), "lastPlaceName", "XXuiaNeQqM");
        setIntField(term230107, term230107.getClass(), "lastAllNetId", 1324332962);
        setIntField(term230107, term230107.getClass(), "lastRegionId", 1021276927);
        setField(term230107, term230107.getClass(), "lastRegionName", "zuNZswjwvh");
        setField(term230107, term230107.getClass(), "lastClientId", "CUwtHZSXXF");
        setField(term230107, term230107.getClass(), "lastCountryCode", "KnZpIapfph");
        setIntField(term230107, term230107.getClass(), "lastSelectEMoney", 871349756);
        setIntField(term230107, term230107.getClass(), "lastSelectTicket", -543589845);
        setIntField(term230107, term230107.getClass(), "lastSelectCourse", -423912362);
        setIntField(term230107, term230107.getClass(), "lastCountCourse", 2008331206);
        setField(term230107, term230107.getClass(), "firstGameId", "OKSBlBxAMS");
        setField(term230107, term230107.getClass(), "firstRomVersion", "TVSQWqAGgr");
        setField(term230107, term230107.getClass(), "firstDataVersion", "wURsdnmHcS");
        setField(term230107, term230107.getClass(), "firstPlayDate", "nAOgCSwECO");
        setField(term230107, term230107.getClass(), "compatibleCmVersion", "shcEVehnSj");
        setField(term230107, term230107.getClass(), "dailyBonusDate", "ruwmVFHYcN");
        setField(term230107, term230107.getClass(), "dailyCourseBonusDate", "PwcPMvUxXL");
        setField(term230107, term230107.getClass(), "lastPairLoginDate", "fPUCoTSiln");
        setField(term230107, term230107.getClass(), "lastTrialPlayDate", "KeYmAATqmS");
        setIntField(term230107, term230107.getClass(), "playVsCount", 1103626679);
        setIntField(term230107, term230107.getClass(), "playSyncCount", 154582855);
        setIntField(term230107, term230107.getClass(), "winCount", 2095511598);
        setIntField(term230107, term230107.getClass(), "helpCount", -723402213);
        setIntField(term230107, term230107.getClass(), "comboCount", 622633785);
        setLongField(term230107, term230107.getClass(), "totalDeluxscore", 4816799479368554284L);
        setLongField(term230107, term230107.getClass(), "totalBasicDeluxscore", 3652673223683322909L);
        setLongField(term230107, term230107.getClass(), "totalAdvancedDeluxscore", 6227673003320806424L);
        setLongField(term230107, term230107.getClass(), "totalExpertDeluxscore", -1484157229223168601L);
        setLongField(term230107, term230107.getClass(), "totalMasterDeluxscore", -6850104699394939381L);
        setLongField(term230107, term230107.getClass(), "totalReMasterDeluxscore", 7427943646966776961L);
        setIntField(term230107, term230107.getClass(), "totalSync", -2061364343);
        setIntField(term230107, term230107.getClass(), "totalBasicSync", 1437426819);
        setIntField(term230107, term230107.getClass(), "totalAdvancedSync", 980185716);
        setIntField(term230107, term230107.getClass(), "totalExpertSync", -451513047);
        setIntField(term230107, term230107.getClass(), "totalMasterSync", 1544010766);
        setIntField(term230107, term230107.getClass(), "totalReMasterSync", 706564579);
        setLongField(term230107, term230107.getClass(), "totalAchievement", 8040374950080130138L);
        setLongField(term230107, term230107.getClass(), "totalBasicAchievement", 7801123516239721316L);
        setLongField(term230107, term230107.getClass(), "totalAdvancedAchievement", 8021841383006833732L);
        setLongField(term230107, term230107.getClass(), "totalExpertAchievement", 102470579642992799L);
        setLongField(term230107, term230107.getClass(), "totalMasterAchievement", -862440733015005866L);
        setLongField(term230107, term230107.getClass(), "totalReMasterAchievement", -8233584794966246633L);
        setLongField(term230107, term230107.getClass(), "playerOldRating", 6005391128356452368L);
        setLongField(term230107, term230107.getClass(), "playerNewRating", 6426040306923535246L);
        setIntField(term230107, term230107.getClass(), "banState", 685229499);
        setLongField(term230107, term230107.getClass(), "dateTime", 703577619581573832L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotalSync", argTypes, term230107, args);
    }

};


