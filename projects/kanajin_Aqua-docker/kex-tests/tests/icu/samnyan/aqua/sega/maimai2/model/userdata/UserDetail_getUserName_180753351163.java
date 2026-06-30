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

public class UserDetail_getUserName_180753351163 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term286326;

    public UserDetail_getUserName_180753351163() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term286326 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        setLongField(term286326, term286326.getClass(), "id", 0L);
        setField(term286326, term286326.getClass(), "card", null);
        setField(term286326, term286326.getClass(), "userName", null);
        setIntField(term286326, term286326.getClass(), "isNetMember", 0);
        setIntField(term286326, term286326.getClass(), "iconId", 0);
        setIntField(term286326, term286326.getClass(), "plateId", 0);
        setIntField(term286326, term286326.getClass(), "titleId", 0);
        setIntField(term286326, term286326.getClass(), "partnerId", 0);
        setIntField(term286326, term286326.getClass(), "frameId", 0);
        setIntField(term286326, term286326.getClass(), "selectMapId", 0);
        setIntField(term286326, term286326.getClass(), "totalAwake", 0);
        setIntField(term286326, term286326.getClass(), "gradeRating", 0);
        setIntField(term286326, term286326.getClass(), "musicRating", 0);
        setIntField(term286326, term286326.getClass(), "playerRating", 0);
        setIntField(term286326, term286326.getClass(), "highestRating", 0);
        setIntField(term286326, term286326.getClass(), "gradeRank", 0);
        setIntField(term286326, term286326.getClass(), "classRank", 0);
        setIntField(term286326, term286326.getClass(), "courseRank", 0);
        setField(term286326, term286326.getClass(), "charaSlot", null);
        setField(term286326, term286326.getClass(), "charaLockSlot", null);
        setLongField(term286326, term286326.getClass(), "contentBit", 0L);
        setIntField(term286326, term286326.getClass(), "playCount", 0);
        setField(term286326, term286326.getClass(), "eventWatchedDate", null);
        setField(term286326, term286326.getClass(), "lastGameId", null);
        setField(term286326, term286326.getClass(), "lastRomVersion", null);
        setField(term286326, term286326.getClass(), "lastDataVersion", null);
        setField(term286326, term286326.getClass(), "lastLoginDate", null);
        setField(term286326, term286326.getClass(), "lastPlayDate", null);
        setIntField(term286326, term286326.getClass(), "lastPlayCredit", 0);
        setIntField(term286326, term286326.getClass(), "lastPlayMode", 0);
        setIntField(term286326, term286326.getClass(), "lastPlaceId", 0);
        setField(term286326, term286326.getClass(), "lastPlaceName", null);
        setIntField(term286326, term286326.getClass(), "lastAllNetId", 0);
        setIntField(term286326, term286326.getClass(), "lastRegionId", 0);
        setField(term286326, term286326.getClass(), "lastRegionName", null);
        setField(term286326, term286326.getClass(), "lastClientId", null);
        setField(term286326, term286326.getClass(), "lastCountryCode", null);
        setIntField(term286326, term286326.getClass(), "lastSelectEMoney", 0);
        setIntField(term286326, term286326.getClass(), "lastSelectTicket", 0);
        setIntField(term286326, term286326.getClass(), "lastSelectCourse", 0);
        setIntField(term286326, term286326.getClass(), "lastCountCourse", 0);
        setField(term286326, term286326.getClass(), "firstGameId", null);
        setField(term286326, term286326.getClass(), "firstRomVersion", null);
        setField(term286326, term286326.getClass(), "firstDataVersion", null);
        setField(term286326, term286326.getClass(), "firstPlayDate", null);
        setField(term286326, term286326.getClass(), "compatibleCmVersion", null);
        setField(term286326, term286326.getClass(), "dailyBonusDate", null);
        setField(term286326, term286326.getClass(), "dailyCourseBonusDate", null);
        setField(term286326, term286326.getClass(), "lastPairLoginDate", null);
        setField(term286326, term286326.getClass(), "lastTrialPlayDate", null);
        setIntField(term286326, term286326.getClass(), "playVsCount", 0);
        setIntField(term286326, term286326.getClass(), "playSyncCount", 0);
        setIntField(term286326, term286326.getClass(), "winCount", 0);
        setIntField(term286326, term286326.getClass(), "helpCount", 0);
        setIntField(term286326, term286326.getClass(), "comboCount", 0);
        setLongField(term286326, term286326.getClass(), "totalDeluxscore", 0L);
        setLongField(term286326, term286326.getClass(), "totalBasicDeluxscore", 0L);
        setLongField(term286326, term286326.getClass(), "totalAdvancedDeluxscore", 0L);
        setLongField(term286326, term286326.getClass(), "totalExpertDeluxscore", 0L);
        setLongField(term286326, term286326.getClass(), "totalMasterDeluxscore", 0L);
        setLongField(term286326, term286326.getClass(), "totalReMasterDeluxscore", 0L);
        setIntField(term286326, term286326.getClass(), "totalSync", 0);
        setIntField(term286326, term286326.getClass(), "totalBasicSync", 0);
        setIntField(term286326, term286326.getClass(), "totalAdvancedSync", 0);
        setIntField(term286326, term286326.getClass(), "totalExpertSync", 0);
        setIntField(term286326, term286326.getClass(), "totalMasterSync", 0);
        setIntField(term286326, term286326.getClass(), "totalReMasterSync", 0);
        setLongField(term286326, term286326.getClass(), "totalAchievement", 0L);
        setLongField(term286326, term286326.getClass(), "totalBasicAchievement", 0L);
        setLongField(term286326, term286326.getClass(), "totalAdvancedAchievement", 0L);
        setLongField(term286326, term286326.getClass(), "totalExpertAchievement", 0L);
        setLongField(term286326, term286326.getClass(), "totalMasterAchievement", 0L);
        setLongField(term286326, term286326.getClass(), "totalReMasterAchievement", 0L);
        setLongField(term286326, term286326.getClass(), "playerOldRating", 0L);
        setLongField(term286326, term286326.getClass(), "playerNewRating", 0L);
        setIntField(term286326, term286326.getClass(), "banState", 0);
        setLongField(term286326, term286326.getClass(), "dateTime", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUserName", argTypes, term286326, args);
    }

};


