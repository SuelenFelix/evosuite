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

public class UserDetail_getUserName_180753351162 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term286271;

    public UserDetail_getUserName_180753351162() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term286271 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        setLongField(term286271, term286271.getClass(), "id", 0L);
        setField(term286271, term286271.getClass(), "card", null);
        setField(term286271, term286271.getClass(), "userName", null);
        setIntField(term286271, term286271.getClass(), "isNetMember", 0);
        setIntField(term286271, term286271.getClass(), "iconId", 0);
        setIntField(term286271, term286271.getClass(), "plateId", 0);
        setIntField(term286271, term286271.getClass(), "titleId", 0);
        setIntField(term286271, term286271.getClass(), "partnerId", 0);
        setIntField(term286271, term286271.getClass(), "frameId", 0);
        setIntField(term286271, term286271.getClass(), "selectMapId", 0);
        setIntField(term286271, term286271.getClass(), "totalAwake", 0);
        setIntField(term286271, term286271.getClass(), "gradeRating", 0);
        setIntField(term286271, term286271.getClass(), "musicRating", 0);
        setIntField(term286271, term286271.getClass(), "playerRating", 0);
        setIntField(term286271, term286271.getClass(), "highestRating", 0);
        setIntField(term286271, term286271.getClass(), "gradeRank", 0);
        setIntField(term286271, term286271.getClass(), "classRank", 0);
        setIntField(term286271, term286271.getClass(), "courseRank", 0);
        setField(term286271, term286271.getClass(), "charaSlot", null);
        setField(term286271, term286271.getClass(), "charaLockSlot", null);
        setLongField(term286271, term286271.getClass(), "contentBit", 0L);
        setIntField(term286271, term286271.getClass(), "playCount", 0);
        setField(term286271, term286271.getClass(), "eventWatchedDate", null);
        setField(term286271, term286271.getClass(), "lastGameId", null);
        setField(term286271, term286271.getClass(), "lastRomVersion", null);
        setField(term286271, term286271.getClass(), "lastDataVersion", null);
        setField(term286271, term286271.getClass(), "lastLoginDate", null);
        setField(term286271, term286271.getClass(), "lastPlayDate", null);
        setIntField(term286271, term286271.getClass(), "lastPlayCredit", 0);
        setIntField(term286271, term286271.getClass(), "lastPlayMode", 0);
        setIntField(term286271, term286271.getClass(), "lastPlaceId", 0);
        setField(term286271, term286271.getClass(), "lastPlaceName", null);
        setIntField(term286271, term286271.getClass(), "lastAllNetId", 0);
        setIntField(term286271, term286271.getClass(), "lastRegionId", 0);
        setField(term286271, term286271.getClass(), "lastRegionName", null);
        setField(term286271, term286271.getClass(), "lastClientId", null);
        setField(term286271, term286271.getClass(), "lastCountryCode", null);
        setIntField(term286271, term286271.getClass(), "lastSelectEMoney", 0);
        setIntField(term286271, term286271.getClass(), "lastSelectTicket", 0);
        setIntField(term286271, term286271.getClass(), "lastSelectCourse", 0);
        setIntField(term286271, term286271.getClass(), "lastCountCourse", 0);
        setField(term286271, term286271.getClass(), "firstGameId", null);
        setField(term286271, term286271.getClass(), "firstRomVersion", null);
        setField(term286271, term286271.getClass(), "firstDataVersion", null);
        setField(term286271, term286271.getClass(), "firstPlayDate", null);
        setField(term286271, term286271.getClass(), "compatibleCmVersion", null);
        setField(term286271, term286271.getClass(), "dailyBonusDate", null);
        setField(term286271, term286271.getClass(), "dailyCourseBonusDate", null);
        setField(term286271, term286271.getClass(), "lastPairLoginDate", null);
        setField(term286271, term286271.getClass(), "lastTrialPlayDate", null);
        setIntField(term286271, term286271.getClass(), "playVsCount", 0);
        setIntField(term286271, term286271.getClass(), "playSyncCount", 0);
        setIntField(term286271, term286271.getClass(), "winCount", 0);
        setIntField(term286271, term286271.getClass(), "helpCount", 0);
        setIntField(term286271, term286271.getClass(), "comboCount", 0);
        setLongField(term286271, term286271.getClass(), "totalDeluxscore", 0L);
        setLongField(term286271, term286271.getClass(), "totalBasicDeluxscore", 0L);
        setLongField(term286271, term286271.getClass(), "totalAdvancedDeluxscore", 0L);
        setLongField(term286271, term286271.getClass(), "totalExpertDeluxscore", 0L);
        setLongField(term286271, term286271.getClass(), "totalMasterDeluxscore", 0L);
        setLongField(term286271, term286271.getClass(), "totalReMasterDeluxscore", 0L);
        setIntField(term286271, term286271.getClass(), "totalSync", 0);
        setIntField(term286271, term286271.getClass(), "totalBasicSync", 0);
        setIntField(term286271, term286271.getClass(), "totalAdvancedSync", 0);
        setIntField(term286271, term286271.getClass(), "totalExpertSync", 0);
        setIntField(term286271, term286271.getClass(), "totalMasterSync", 0);
        setIntField(term286271, term286271.getClass(), "totalReMasterSync", 0);
        setLongField(term286271, term286271.getClass(), "totalAchievement", 0L);
        setLongField(term286271, term286271.getClass(), "totalBasicAchievement", 0L);
        setLongField(term286271, term286271.getClass(), "totalAdvancedAchievement", 0L);
        setLongField(term286271, term286271.getClass(), "totalExpertAchievement", 0L);
        setLongField(term286271, term286271.getClass(), "totalMasterAchievement", 0L);
        setLongField(term286271, term286271.getClass(), "totalReMasterAchievement", 0L);
        setLongField(term286271, term286271.getClass(), "playerOldRating", 0L);
        setLongField(term286271, term286271.getClass(), "playerNewRating", 0L);
        setIntField(term286271, term286271.getClass(), "banState", 0);
        setLongField(term286271, term286271.getClass(), "dateTime", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUserName", argTypes, term286271, args);
    }

};


