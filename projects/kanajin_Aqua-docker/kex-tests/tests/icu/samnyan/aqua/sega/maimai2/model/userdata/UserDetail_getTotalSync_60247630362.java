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

public class UserDetail_getTotalSync_60247630362 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term230162;

    public UserDetail_getTotalSync_60247630362() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term230166 = new Long(-5004803270846838598L);
        ArrayList term230227 = new ArrayList();
        ArrayList term230231 = new ArrayList();
        term230162 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term230164 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term230180 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term230181 = newInstance(Class.forName("java.time.LocalDate"));
        Object term230185 = newInstance(Class.forName("java.time.LocalTime"));
        Object term230190 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term230191 = newInstance(Class.forName("java.time.LocalDate"));
        Object term230195 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term230162, term230162.getClass(), "id", -268890584351402081L);
        setLongField(term230164, term230164.getClass(), "id", -978448106392119367L);
        setField(term230164, term230164.getClass(), "extId", term230166);
        setField(term230164, term230164.getClass(), "luid", "yjaHcOpjcZ");
        setIntField(term230181, term230181.getClass(), "year", 2020);
        setShortField(term230181, term230181.getClass(), "month", (short) 2);
        setShortField(term230181, term230181.getClass(), "day", (short) 28);
        setField(term230180, term230180.getClass(), "date", term230181);
        setByteField(term230185, term230185.getClass(), "hour", (byte) 3);
        setByteField(term230185, term230185.getClass(), "minute", (byte) 46);
        setByteField(term230185, term230185.getClass(), "second", (byte) 58);
        setIntField(term230185, term230185.getClass(), "nano", 519279868);
        setField(term230180, term230180.getClass(), "time", term230185);
        setField(term230164, term230164.getClass(), "registerTime", term230180);
        setIntField(term230191, term230191.getClass(), "year", 2028);
        setShortField(term230191, term230191.getClass(), "month", (short) 8);
        setShortField(term230191, term230191.getClass(), "day", (short) 27);
        setField(term230190, term230190.getClass(), "date", term230191);
        setByteField(term230195, term230195.getClass(), "hour", (byte) 5);
        setByteField(term230195, term230195.getClass(), "minute", (byte) 50);
        setByteField(term230195, term230195.getClass(), "second", (byte) 39);
        setIntField(term230195, term230195.getClass(), "nano", 452455240);
        setField(term230190, term230190.getClass(), "time", term230195);
        setField(term230164, term230164.getClass(), "accessTime", term230190);
        setField(term230162, term230162.getClass(), "card", term230164);
        setField(term230162, term230162.getClass(), "userName", "oZYHhFZGXx");
        setIntField(term230162, term230162.getClass(), "isNetMember", -1308727775);
        setIntField(term230162, term230162.getClass(), "iconId", 923435355);
        setIntField(term230162, term230162.getClass(), "plateId", 529707862);
        setIntField(term230162, term230162.getClass(), "titleId", 1163541549);
        setIntField(term230162, term230162.getClass(), "partnerId", 85255563);
        setIntField(term230162, term230162.getClass(), "frameId", 1698224861);
        setIntField(term230162, term230162.getClass(), "selectMapId", -1675006092);
        setIntField(term230162, term230162.getClass(), "totalAwake", -71395930);
        setIntField(term230162, term230162.getClass(), "gradeRating", -1327988712);
        setIntField(term230162, term230162.getClass(), "musicRating", -481078842);
        setIntField(term230162, term230162.getClass(), "playerRating", 133257591);
        setIntField(term230162, term230162.getClass(), "highestRating", -171155321);
        setIntField(term230162, term230162.getClass(), "gradeRank", -677950072);
        setIntField(term230162, term230162.getClass(), "classRank", -904761728);
        setIntField(term230162, term230162.getClass(), "courseRank", 2000897549);
        setField(term230162, term230162.getClass(), "charaSlot", term230227);
        setField(term230162, term230162.getClass(), "charaLockSlot", term230231);
        setLongField(term230162, term230162.getClass(), "contentBit", -3528336609655788551L);
        setIntField(term230162, term230162.getClass(), "playCount", 1826955502);
        setField(term230162, term230162.getClass(), "eventWatchedDate", "DRDfOzZyDb");
        setField(term230162, term230162.getClass(), "lastGameId", "FMSzTGVPul");
        setField(term230162, term230162.getClass(), "lastRomVersion", "qSFkTIyPfh");
        setField(term230162, term230162.getClass(), "lastDataVersion", "tbYTpFYzqZ");
        setField(term230162, term230162.getClass(), "lastLoginDate", "BNLfzlakIC");
        setField(term230162, term230162.getClass(), "lastPlayDate", "nzqaGEtJND");
        setIntField(term230162, term230162.getClass(), "lastPlayCredit", -757144818);
        setIntField(term230162, term230162.getClass(), "lastPlayMode", 519574863);
        setIntField(term230162, term230162.getClass(), "lastPlaceId", 1696650503);
        setField(term230162, term230162.getClass(), "lastPlaceName", "XXuiaNeQqM");
        setIntField(term230162, term230162.getClass(), "lastAllNetId", 1324332962);
        setIntField(term230162, term230162.getClass(), "lastRegionId", 1021276927);
        setField(term230162, term230162.getClass(), "lastRegionName", "zuNZswjwvh");
        setField(term230162, term230162.getClass(), "lastClientId", "CUwtHZSXXF");
        setField(term230162, term230162.getClass(), "lastCountryCode", "KnZpIapfph");
        setIntField(term230162, term230162.getClass(), "lastSelectEMoney", 871349756);
        setIntField(term230162, term230162.getClass(), "lastSelectTicket", -543589845);
        setIntField(term230162, term230162.getClass(), "lastSelectCourse", -423912362);
        setIntField(term230162, term230162.getClass(), "lastCountCourse", 2008331206);
        setField(term230162, term230162.getClass(), "firstGameId", "OKSBlBxAMS");
        setField(term230162, term230162.getClass(), "firstRomVersion", "TVSQWqAGgr");
        setField(term230162, term230162.getClass(), "firstDataVersion", "wURsdnmHcS");
        setField(term230162, term230162.getClass(), "firstPlayDate", "nAOgCSwECO");
        setField(term230162, term230162.getClass(), "compatibleCmVersion", "shcEVehnSj");
        setField(term230162, term230162.getClass(), "dailyBonusDate", "ruwmVFHYcN");
        setField(term230162, term230162.getClass(), "dailyCourseBonusDate", "PwcPMvUxXL");
        setField(term230162, term230162.getClass(), "lastPairLoginDate", "fPUCoTSiln");
        setField(term230162, term230162.getClass(), "lastTrialPlayDate", "KeYmAATqmS");
        setIntField(term230162, term230162.getClass(), "playVsCount", 1103626679);
        setIntField(term230162, term230162.getClass(), "playSyncCount", 154582855);
        setIntField(term230162, term230162.getClass(), "winCount", 2095511598);
        setIntField(term230162, term230162.getClass(), "helpCount", -723402213);
        setIntField(term230162, term230162.getClass(), "comboCount", 622633785);
        setLongField(term230162, term230162.getClass(), "totalDeluxscore", 4816799479368554284L);
        setLongField(term230162, term230162.getClass(), "totalBasicDeluxscore", 3652673223683322909L);
        setLongField(term230162, term230162.getClass(), "totalAdvancedDeluxscore", 6227673003320806424L);
        setLongField(term230162, term230162.getClass(), "totalExpertDeluxscore", -1484157229223168601L);
        setLongField(term230162, term230162.getClass(), "totalMasterDeluxscore", -6850104699394939381L);
        setLongField(term230162, term230162.getClass(), "totalReMasterDeluxscore", 7427943646966776961L);
        setIntField(term230162, term230162.getClass(), "totalSync", -2061364343);
        setIntField(term230162, term230162.getClass(), "totalBasicSync", 1437426819);
        setIntField(term230162, term230162.getClass(), "totalAdvancedSync", 980185716);
        setIntField(term230162, term230162.getClass(), "totalExpertSync", -451513047);
        setIntField(term230162, term230162.getClass(), "totalMasterSync", 1544010766);
        setIntField(term230162, term230162.getClass(), "totalReMasterSync", 706564579);
        setLongField(term230162, term230162.getClass(), "totalAchievement", 8040374950080130138L);
        setLongField(term230162, term230162.getClass(), "totalBasicAchievement", 7801123516239721316L);
        setLongField(term230162, term230162.getClass(), "totalAdvancedAchievement", 8021841383006833732L);
        setLongField(term230162, term230162.getClass(), "totalExpertAchievement", 102470579642992799L);
        setLongField(term230162, term230162.getClass(), "totalMasterAchievement", -862440733015005866L);
        setLongField(term230162, term230162.getClass(), "totalReMasterAchievement", -8233584794966246633L);
        setLongField(term230162, term230162.getClass(), "playerOldRating", 6005391128356452368L);
        setLongField(term230162, term230162.getClass(), "playerNewRating", 6426040306923535246L);
        setIntField(term230162, term230162.getClass(), "banState", 685229499);
        setLongField(term230162, term230162.getClass(), "dateTime", 703577619581573832L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotalSync", argTypes, term230162, args);
    }

};


