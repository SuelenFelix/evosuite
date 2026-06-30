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
import java.lang.Long;

public class UserDetail_setTotalAchievement_1484519093304 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term294169;
     Object term294224;

    public UserDetail_setTotalAchievement_1484519093304() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term294169 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        setLongField(term294169, term294169.getClass(), "id", 0L);
        setField(term294169, term294169.getClass(), "card", null);
        setField(term294169, term294169.getClass(), "userName", null);
        setIntField(term294169, term294169.getClass(), "isNetMember", 0);
        setIntField(term294169, term294169.getClass(), "iconId", 0);
        setIntField(term294169, term294169.getClass(), "plateId", 0);
        setIntField(term294169, term294169.getClass(), "titleId", 0);
        setIntField(term294169, term294169.getClass(), "partnerId", 0);
        setIntField(term294169, term294169.getClass(), "frameId", 0);
        setIntField(term294169, term294169.getClass(), "selectMapId", 0);
        setIntField(term294169, term294169.getClass(), "totalAwake", 0);
        setIntField(term294169, term294169.getClass(), "gradeRating", 0);
        setIntField(term294169, term294169.getClass(), "musicRating", 0);
        setIntField(term294169, term294169.getClass(), "playerRating", 0);
        setIntField(term294169, term294169.getClass(), "highestRating", 0);
        setIntField(term294169, term294169.getClass(), "gradeRank", 0);
        setIntField(term294169, term294169.getClass(), "classRank", 0);
        setIntField(term294169, term294169.getClass(), "courseRank", 0);
        setField(term294169, term294169.getClass(), "charaSlot", null);
        setField(term294169, term294169.getClass(), "charaLockSlot", null);
        setLongField(term294169, term294169.getClass(), "contentBit", 0L);
        setIntField(term294169, term294169.getClass(), "playCount", 0);
        setField(term294169, term294169.getClass(), "eventWatchedDate", null);
        setField(term294169, term294169.getClass(), "lastGameId", null);
        setField(term294169, term294169.getClass(), "lastRomVersion", null);
        setField(term294169, term294169.getClass(), "lastDataVersion", null);
        setField(term294169, term294169.getClass(), "lastLoginDate", null);
        setField(term294169, term294169.getClass(), "lastPlayDate", null);
        setIntField(term294169, term294169.getClass(), "lastPlayCredit", 0);
        setIntField(term294169, term294169.getClass(), "lastPlayMode", 0);
        setIntField(term294169, term294169.getClass(), "lastPlaceId", 0);
        setField(term294169, term294169.getClass(), "lastPlaceName", null);
        setIntField(term294169, term294169.getClass(), "lastAllNetId", 0);
        setIntField(term294169, term294169.getClass(), "lastRegionId", 0);
        setField(term294169, term294169.getClass(), "lastRegionName", null);
        setField(term294169, term294169.getClass(), "lastClientId", null);
        setField(term294169, term294169.getClass(), "lastCountryCode", null);
        setIntField(term294169, term294169.getClass(), "lastSelectEMoney", 0);
        setIntField(term294169, term294169.getClass(), "lastSelectTicket", 0);
        setIntField(term294169, term294169.getClass(), "lastSelectCourse", 0);
        setIntField(term294169, term294169.getClass(), "lastCountCourse", 0);
        setField(term294169, term294169.getClass(), "firstGameId", null);
        setField(term294169, term294169.getClass(), "firstRomVersion", null);
        setField(term294169, term294169.getClass(), "firstDataVersion", null);
        setField(term294169, term294169.getClass(), "firstPlayDate", null);
        setField(term294169, term294169.getClass(), "compatibleCmVersion", null);
        setField(term294169, term294169.getClass(), "dailyBonusDate", null);
        setField(term294169, term294169.getClass(), "dailyCourseBonusDate", null);
        setField(term294169, term294169.getClass(), "lastPairLoginDate", null);
        setField(term294169, term294169.getClass(), "lastTrialPlayDate", null);
        setIntField(term294169, term294169.getClass(), "playVsCount", 0);
        setIntField(term294169, term294169.getClass(), "playSyncCount", 0);
        setIntField(term294169, term294169.getClass(), "winCount", 0);
        setIntField(term294169, term294169.getClass(), "helpCount", 0);
        setIntField(term294169, term294169.getClass(), "comboCount", 0);
        setLongField(term294169, term294169.getClass(), "totalDeluxscore", 0L);
        setLongField(term294169, term294169.getClass(), "totalBasicDeluxscore", 0L);
        setLongField(term294169, term294169.getClass(), "totalAdvancedDeluxscore", 0L);
        setLongField(term294169, term294169.getClass(), "totalExpertDeluxscore", 0L);
        setLongField(term294169, term294169.getClass(), "totalMasterDeluxscore", 0L);
        setLongField(term294169, term294169.getClass(), "totalReMasterDeluxscore", 0L);
        setIntField(term294169, term294169.getClass(), "totalSync", 0);
        setIntField(term294169, term294169.getClass(), "totalBasicSync", 0);
        setIntField(term294169, term294169.getClass(), "totalAdvancedSync", 0);
        setIntField(term294169, term294169.getClass(), "totalExpertSync", 0);
        setIntField(term294169, term294169.getClass(), "totalMasterSync", 0);
        setIntField(term294169, term294169.getClass(), "totalReMasterSync", 0);
        setLongField(term294169, term294169.getClass(), "totalAchievement", 0L);
        setLongField(term294169, term294169.getClass(), "totalBasicAchievement", 0L);
        setLongField(term294169, term294169.getClass(), "totalAdvancedAchievement", 0L);
        setLongField(term294169, term294169.getClass(), "totalExpertAchievement", 0L);
        setLongField(term294169, term294169.getClass(), "totalMasterAchievement", 0L);
        setLongField(term294169, term294169.getClass(), "totalReMasterAchievement", 0L);
        setLongField(term294169, term294169.getClass(), "playerOldRating", 0L);
        setLongField(term294169, term294169.getClass(), "playerNewRating", 0L);
        setIntField(term294169, term294169.getClass(), "banState", 0);
        setLongField(term294169, term294169.getClass(), "dateTime", 0L);
        term294224 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term294224;
        callMethod(klass, "setTotalAchievement", argTypes, term294169, args);
    }

};


