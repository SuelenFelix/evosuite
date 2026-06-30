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

public class UserDetail_setTotalMasterSync_1773928669302 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term294055;
     Object term294110;

    public UserDetail_setTotalMasterSync_1773928669302() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term294055 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        setLongField(term294055, term294055.getClass(), "id", 0L);
        setField(term294055, term294055.getClass(), "card", null);
        setField(term294055, term294055.getClass(), "userName", null);
        setIntField(term294055, term294055.getClass(), "isNetMember", 0);
        setIntField(term294055, term294055.getClass(), "iconId", 0);
        setIntField(term294055, term294055.getClass(), "plateId", 0);
        setIntField(term294055, term294055.getClass(), "titleId", 0);
        setIntField(term294055, term294055.getClass(), "partnerId", 0);
        setIntField(term294055, term294055.getClass(), "frameId", 0);
        setIntField(term294055, term294055.getClass(), "selectMapId", 0);
        setIntField(term294055, term294055.getClass(), "totalAwake", 0);
        setIntField(term294055, term294055.getClass(), "gradeRating", 0);
        setIntField(term294055, term294055.getClass(), "musicRating", 0);
        setIntField(term294055, term294055.getClass(), "playerRating", 0);
        setIntField(term294055, term294055.getClass(), "highestRating", 0);
        setIntField(term294055, term294055.getClass(), "gradeRank", 0);
        setIntField(term294055, term294055.getClass(), "classRank", 0);
        setIntField(term294055, term294055.getClass(), "courseRank", 0);
        setField(term294055, term294055.getClass(), "charaSlot", null);
        setField(term294055, term294055.getClass(), "charaLockSlot", null);
        setLongField(term294055, term294055.getClass(), "contentBit", 0L);
        setIntField(term294055, term294055.getClass(), "playCount", 0);
        setField(term294055, term294055.getClass(), "eventWatchedDate", null);
        setField(term294055, term294055.getClass(), "lastGameId", null);
        setField(term294055, term294055.getClass(), "lastRomVersion", null);
        setField(term294055, term294055.getClass(), "lastDataVersion", null);
        setField(term294055, term294055.getClass(), "lastLoginDate", null);
        setField(term294055, term294055.getClass(), "lastPlayDate", null);
        setIntField(term294055, term294055.getClass(), "lastPlayCredit", 0);
        setIntField(term294055, term294055.getClass(), "lastPlayMode", 0);
        setIntField(term294055, term294055.getClass(), "lastPlaceId", 0);
        setField(term294055, term294055.getClass(), "lastPlaceName", null);
        setIntField(term294055, term294055.getClass(), "lastAllNetId", 0);
        setIntField(term294055, term294055.getClass(), "lastRegionId", 0);
        setField(term294055, term294055.getClass(), "lastRegionName", null);
        setField(term294055, term294055.getClass(), "lastClientId", null);
        setField(term294055, term294055.getClass(), "lastCountryCode", null);
        setIntField(term294055, term294055.getClass(), "lastSelectEMoney", 0);
        setIntField(term294055, term294055.getClass(), "lastSelectTicket", 0);
        setIntField(term294055, term294055.getClass(), "lastSelectCourse", 0);
        setIntField(term294055, term294055.getClass(), "lastCountCourse", 0);
        setField(term294055, term294055.getClass(), "firstGameId", null);
        setField(term294055, term294055.getClass(), "firstRomVersion", null);
        setField(term294055, term294055.getClass(), "firstDataVersion", null);
        setField(term294055, term294055.getClass(), "firstPlayDate", null);
        setField(term294055, term294055.getClass(), "compatibleCmVersion", null);
        setField(term294055, term294055.getClass(), "dailyBonusDate", null);
        setField(term294055, term294055.getClass(), "dailyCourseBonusDate", null);
        setField(term294055, term294055.getClass(), "lastPairLoginDate", null);
        setField(term294055, term294055.getClass(), "lastTrialPlayDate", null);
        setIntField(term294055, term294055.getClass(), "playVsCount", 0);
        setIntField(term294055, term294055.getClass(), "playSyncCount", 0);
        setIntField(term294055, term294055.getClass(), "winCount", 0);
        setIntField(term294055, term294055.getClass(), "helpCount", 0);
        setIntField(term294055, term294055.getClass(), "comboCount", 0);
        setLongField(term294055, term294055.getClass(), "totalDeluxscore", 0L);
        setLongField(term294055, term294055.getClass(), "totalBasicDeluxscore", 0L);
        setLongField(term294055, term294055.getClass(), "totalAdvancedDeluxscore", 0L);
        setLongField(term294055, term294055.getClass(), "totalExpertDeluxscore", 0L);
        setLongField(term294055, term294055.getClass(), "totalMasterDeluxscore", 0L);
        setLongField(term294055, term294055.getClass(), "totalReMasterDeluxscore", 0L);
        setIntField(term294055, term294055.getClass(), "totalSync", 0);
        setIntField(term294055, term294055.getClass(), "totalBasicSync", 0);
        setIntField(term294055, term294055.getClass(), "totalAdvancedSync", 0);
        setIntField(term294055, term294055.getClass(), "totalExpertSync", 0);
        setIntField(term294055, term294055.getClass(), "totalMasterSync", 0);
        setIntField(term294055, term294055.getClass(), "totalReMasterSync", 0);
        setLongField(term294055, term294055.getClass(), "totalAchievement", 0L);
        setLongField(term294055, term294055.getClass(), "totalBasicAchievement", 0L);
        setLongField(term294055, term294055.getClass(), "totalAdvancedAchievement", 0L);
        setLongField(term294055, term294055.getClass(), "totalExpertAchievement", 0L);
        setLongField(term294055, term294055.getClass(), "totalMasterAchievement", 0L);
        setLongField(term294055, term294055.getClass(), "totalReMasterAchievement", 0L);
        setLongField(term294055, term294055.getClass(), "playerOldRating", 0L);
        setLongField(term294055, term294055.getClass(), "playerNewRating", 0L);
        setIntField(term294055, term294055.getClass(), "banState", 0);
        setLongField(term294055, term294055.getClass(), "dateTime", 0L);
        term294110 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term294110;
        callMethod(klass, "setTotalMasterSync", argTypes, term294055, args);
    }

};


