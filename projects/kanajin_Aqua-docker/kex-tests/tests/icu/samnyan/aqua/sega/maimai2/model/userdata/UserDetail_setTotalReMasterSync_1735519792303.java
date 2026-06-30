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
import java.lang.Integer;

public class UserDetail_setTotalReMasterSync_1735519792303 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term294112;
     Object term294167;

    public UserDetail_setTotalReMasterSync_1735519792303() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term294112 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        setLongField(term294112, term294112.getClass(), "id", 0L);
        setField(term294112, term294112.getClass(), "card", null);
        setField(term294112, term294112.getClass(), "userName", null);
        setIntField(term294112, term294112.getClass(), "isNetMember", 0);
        setIntField(term294112, term294112.getClass(), "iconId", 0);
        setIntField(term294112, term294112.getClass(), "plateId", 0);
        setIntField(term294112, term294112.getClass(), "titleId", 0);
        setIntField(term294112, term294112.getClass(), "partnerId", 0);
        setIntField(term294112, term294112.getClass(), "frameId", 0);
        setIntField(term294112, term294112.getClass(), "selectMapId", 0);
        setIntField(term294112, term294112.getClass(), "totalAwake", 0);
        setIntField(term294112, term294112.getClass(), "gradeRating", 0);
        setIntField(term294112, term294112.getClass(), "musicRating", 0);
        setIntField(term294112, term294112.getClass(), "playerRating", 0);
        setIntField(term294112, term294112.getClass(), "highestRating", 0);
        setIntField(term294112, term294112.getClass(), "gradeRank", 0);
        setIntField(term294112, term294112.getClass(), "classRank", 0);
        setIntField(term294112, term294112.getClass(), "courseRank", 0);
        setField(term294112, term294112.getClass(), "charaSlot", null);
        setField(term294112, term294112.getClass(), "charaLockSlot", null);
        setLongField(term294112, term294112.getClass(), "contentBit", 0L);
        setIntField(term294112, term294112.getClass(), "playCount", 0);
        setField(term294112, term294112.getClass(), "eventWatchedDate", null);
        setField(term294112, term294112.getClass(), "lastGameId", null);
        setField(term294112, term294112.getClass(), "lastRomVersion", null);
        setField(term294112, term294112.getClass(), "lastDataVersion", null);
        setField(term294112, term294112.getClass(), "lastLoginDate", null);
        setField(term294112, term294112.getClass(), "lastPlayDate", null);
        setIntField(term294112, term294112.getClass(), "lastPlayCredit", 0);
        setIntField(term294112, term294112.getClass(), "lastPlayMode", 0);
        setIntField(term294112, term294112.getClass(), "lastPlaceId", 0);
        setField(term294112, term294112.getClass(), "lastPlaceName", null);
        setIntField(term294112, term294112.getClass(), "lastAllNetId", 0);
        setIntField(term294112, term294112.getClass(), "lastRegionId", 0);
        setField(term294112, term294112.getClass(), "lastRegionName", null);
        setField(term294112, term294112.getClass(), "lastClientId", null);
        setField(term294112, term294112.getClass(), "lastCountryCode", null);
        setIntField(term294112, term294112.getClass(), "lastSelectEMoney", 0);
        setIntField(term294112, term294112.getClass(), "lastSelectTicket", 0);
        setIntField(term294112, term294112.getClass(), "lastSelectCourse", 0);
        setIntField(term294112, term294112.getClass(), "lastCountCourse", 0);
        setField(term294112, term294112.getClass(), "firstGameId", null);
        setField(term294112, term294112.getClass(), "firstRomVersion", null);
        setField(term294112, term294112.getClass(), "firstDataVersion", null);
        setField(term294112, term294112.getClass(), "firstPlayDate", null);
        setField(term294112, term294112.getClass(), "compatibleCmVersion", null);
        setField(term294112, term294112.getClass(), "dailyBonusDate", null);
        setField(term294112, term294112.getClass(), "dailyCourseBonusDate", null);
        setField(term294112, term294112.getClass(), "lastPairLoginDate", null);
        setField(term294112, term294112.getClass(), "lastTrialPlayDate", null);
        setIntField(term294112, term294112.getClass(), "playVsCount", 0);
        setIntField(term294112, term294112.getClass(), "playSyncCount", 0);
        setIntField(term294112, term294112.getClass(), "winCount", 0);
        setIntField(term294112, term294112.getClass(), "helpCount", 0);
        setIntField(term294112, term294112.getClass(), "comboCount", 0);
        setLongField(term294112, term294112.getClass(), "totalDeluxscore", 0L);
        setLongField(term294112, term294112.getClass(), "totalBasicDeluxscore", 0L);
        setLongField(term294112, term294112.getClass(), "totalAdvancedDeluxscore", 0L);
        setLongField(term294112, term294112.getClass(), "totalExpertDeluxscore", 0L);
        setLongField(term294112, term294112.getClass(), "totalMasterDeluxscore", 0L);
        setLongField(term294112, term294112.getClass(), "totalReMasterDeluxscore", 0L);
        setIntField(term294112, term294112.getClass(), "totalSync", 0);
        setIntField(term294112, term294112.getClass(), "totalBasicSync", 0);
        setIntField(term294112, term294112.getClass(), "totalAdvancedSync", 0);
        setIntField(term294112, term294112.getClass(), "totalExpertSync", 0);
        setIntField(term294112, term294112.getClass(), "totalMasterSync", 0);
        setIntField(term294112, term294112.getClass(), "totalReMasterSync", 0);
        setLongField(term294112, term294112.getClass(), "totalAchievement", 0L);
        setLongField(term294112, term294112.getClass(), "totalBasicAchievement", 0L);
        setLongField(term294112, term294112.getClass(), "totalAdvancedAchievement", 0L);
        setLongField(term294112, term294112.getClass(), "totalExpertAchievement", 0L);
        setLongField(term294112, term294112.getClass(), "totalMasterAchievement", 0L);
        setLongField(term294112, term294112.getClass(), "totalReMasterAchievement", 0L);
        setLongField(term294112, term294112.getClass(), "playerOldRating", 0L);
        setLongField(term294112, term294112.getClass(), "playerNewRating", 0L);
        setIntField(term294112, term294112.getClass(), "banState", 0);
        setLongField(term294112, term294112.getClass(), "dateTime", 0L);
        term294167 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term294167;
        callMethod(klass, "setTotalReMasterSync", argTypes, term294112, args);
    }

};


