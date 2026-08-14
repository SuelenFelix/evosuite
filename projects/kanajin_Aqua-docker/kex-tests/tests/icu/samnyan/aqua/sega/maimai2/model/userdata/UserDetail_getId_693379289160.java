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

public class UserDetail_getId_693379289160 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term286161;

    public UserDetail_getId_693379289160() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term286161 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        setLongField(term286161, term286161.getClass(), "id", 0L);
        setField(term286161, term286161.getClass(), "card", null);
        setField(term286161, term286161.getClass(), "userName", null);
        setIntField(term286161, term286161.getClass(), "isNetMember", 0);
        setIntField(term286161, term286161.getClass(), "iconId", 0);
        setIntField(term286161, term286161.getClass(), "plateId", 0);
        setIntField(term286161, term286161.getClass(), "titleId", 0);
        setIntField(term286161, term286161.getClass(), "partnerId", 0);
        setIntField(term286161, term286161.getClass(), "frameId", 0);
        setIntField(term286161, term286161.getClass(), "selectMapId", 0);
        setIntField(term286161, term286161.getClass(), "totalAwake", 0);
        setIntField(term286161, term286161.getClass(), "gradeRating", 0);
        setIntField(term286161, term286161.getClass(), "musicRating", 0);
        setIntField(term286161, term286161.getClass(), "playerRating", 0);
        setIntField(term286161, term286161.getClass(), "highestRating", 0);
        setIntField(term286161, term286161.getClass(), "gradeRank", 0);
        setIntField(term286161, term286161.getClass(), "classRank", 0);
        setIntField(term286161, term286161.getClass(), "courseRank", 0);
        setField(term286161, term286161.getClass(), "charaSlot", null);
        setField(term286161, term286161.getClass(), "charaLockSlot", null);
        setLongField(term286161, term286161.getClass(), "contentBit", 0L);
        setIntField(term286161, term286161.getClass(), "playCount", 0);
        setField(term286161, term286161.getClass(), "eventWatchedDate", null);
        setField(term286161, term286161.getClass(), "lastGameId", null);
        setField(term286161, term286161.getClass(), "lastRomVersion", null);
        setField(term286161, term286161.getClass(), "lastDataVersion", null);
        setField(term286161, term286161.getClass(), "lastLoginDate", null);
        setField(term286161, term286161.getClass(), "lastPlayDate", null);
        setIntField(term286161, term286161.getClass(), "lastPlayCredit", 0);
        setIntField(term286161, term286161.getClass(), "lastPlayMode", 0);
        setIntField(term286161, term286161.getClass(), "lastPlaceId", 0);
        setField(term286161, term286161.getClass(), "lastPlaceName", null);
        setIntField(term286161, term286161.getClass(), "lastAllNetId", 0);
        setIntField(term286161, term286161.getClass(), "lastRegionId", 0);
        setField(term286161, term286161.getClass(), "lastRegionName", null);
        setField(term286161, term286161.getClass(), "lastClientId", null);
        setField(term286161, term286161.getClass(), "lastCountryCode", null);
        setIntField(term286161, term286161.getClass(), "lastSelectEMoney", 0);
        setIntField(term286161, term286161.getClass(), "lastSelectTicket", 0);
        setIntField(term286161, term286161.getClass(), "lastSelectCourse", 0);
        setIntField(term286161, term286161.getClass(), "lastCountCourse", 0);
        setField(term286161, term286161.getClass(), "firstGameId", null);
        setField(term286161, term286161.getClass(), "firstRomVersion", null);
        setField(term286161, term286161.getClass(), "firstDataVersion", null);
        setField(term286161, term286161.getClass(), "firstPlayDate", null);
        setField(term286161, term286161.getClass(), "compatibleCmVersion", null);
        setField(term286161, term286161.getClass(), "dailyBonusDate", null);
        setField(term286161, term286161.getClass(), "dailyCourseBonusDate", null);
        setField(term286161, term286161.getClass(), "lastPairLoginDate", null);
        setField(term286161, term286161.getClass(), "lastTrialPlayDate", null);
        setIntField(term286161, term286161.getClass(), "playVsCount", 0);
        setIntField(term286161, term286161.getClass(), "playSyncCount", 0);
        setIntField(term286161, term286161.getClass(), "winCount", 0);
        setIntField(term286161, term286161.getClass(), "helpCount", 0);
        setIntField(term286161, term286161.getClass(), "comboCount", 0);
        setLongField(term286161, term286161.getClass(), "totalDeluxscore", 0L);
        setLongField(term286161, term286161.getClass(), "totalBasicDeluxscore", 0L);
        setLongField(term286161, term286161.getClass(), "totalAdvancedDeluxscore", 0L);
        setLongField(term286161, term286161.getClass(), "totalExpertDeluxscore", 0L);
        setLongField(term286161, term286161.getClass(), "totalMasterDeluxscore", 0L);
        setLongField(term286161, term286161.getClass(), "totalReMasterDeluxscore", 0L);
        setIntField(term286161, term286161.getClass(), "totalSync", 0);
        setIntField(term286161, term286161.getClass(), "totalBasicSync", 0);
        setIntField(term286161, term286161.getClass(), "totalAdvancedSync", 0);
        setIntField(term286161, term286161.getClass(), "totalExpertSync", 0);
        setIntField(term286161, term286161.getClass(), "totalMasterSync", 0);
        setIntField(term286161, term286161.getClass(), "totalReMasterSync", 0);
        setLongField(term286161, term286161.getClass(), "totalAchievement", 0L);
        setLongField(term286161, term286161.getClass(), "totalBasicAchievement", 0L);
        setLongField(term286161, term286161.getClass(), "totalAdvancedAchievement", 0L);
        setLongField(term286161, term286161.getClass(), "totalExpertAchievement", 0L);
        setLongField(term286161, term286161.getClass(), "totalMasterAchievement", 0L);
        setLongField(term286161, term286161.getClass(), "totalReMasterAchievement", 0L);
        setLongField(term286161, term286161.getClass(), "playerOldRating", 0L);
        setLongField(term286161, term286161.getClass(), "playerNewRating", 0L);
        setIntField(term286161, term286161.getClass(), "banState", 0);
        setLongField(term286161, term286161.getClass(), "dateTime", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term286161, args);
    }

};


