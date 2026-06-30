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

public class UserDetail_getTitleId_1376857083166 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4320664;

    public UserDetail_getTitleId_1376857083166() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4320664 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        setLongField(term4320664, term4320664.getClass(), "id", 0L);
        setField(term4320664, term4320664.getClass(), "card", null);
        setField(term4320664, term4320664.getClass(), "userName", null);
        setIntField(term4320664, term4320664.getClass(), "isNetMember", 0);
        setIntField(term4320664, term4320664.getClass(), "iconId", 0);
        setIntField(term4320664, term4320664.getClass(), "plateId", 0);
        setIntField(term4320664, term4320664.getClass(), "titleId", 0);
        setIntField(term4320664, term4320664.getClass(), "partnerId", 0);
        setIntField(term4320664, term4320664.getClass(), "frameId", 0);
        setIntField(term4320664, term4320664.getClass(), "selectMapId", 0);
        setIntField(term4320664, term4320664.getClass(), "totalAwake", 0);
        setIntField(term4320664, term4320664.getClass(), "gradeRating", 0);
        setIntField(term4320664, term4320664.getClass(), "musicRating", 0);
        setIntField(term4320664, term4320664.getClass(), "playerRating", 0);
        setIntField(term4320664, term4320664.getClass(), "highestRating", 0);
        setIntField(term4320664, term4320664.getClass(), "gradeRank", 0);
        setIntField(term4320664, term4320664.getClass(), "classRank", 0);
        setIntField(term4320664, term4320664.getClass(), "courseRank", 0);
        setField(term4320664, term4320664.getClass(), "charaSlot", null);
        setField(term4320664, term4320664.getClass(), "charaLockSlot", null);
        setLongField(term4320664, term4320664.getClass(), "contentBit", 0L);
        setIntField(term4320664, term4320664.getClass(), "playCount", 0);
        setField(term4320664, term4320664.getClass(), "eventWatchedDate", null);
        setField(term4320664, term4320664.getClass(), "lastGameId", null);
        setField(term4320664, term4320664.getClass(), "lastRomVersion", null);
        setField(term4320664, term4320664.getClass(), "lastDataVersion", null);
        setField(term4320664, term4320664.getClass(), "lastLoginDate", null);
        setField(term4320664, term4320664.getClass(), "lastPlayDate", null);
        setIntField(term4320664, term4320664.getClass(), "lastPlayCredit", 0);
        setIntField(term4320664, term4320664.getClass(), "lastPlayMode", 0);
        setIntField(term4320664, term4320664.getClass(), "lastPlaceId", 0);
        setField(term4320664, term4320664.getClass(), "lastPlaceName", null);
        setIntField(term4320664, term4320664.getClass(), "lastAllNetId", 0);
        setIntField(term4320664, term4320664.getClass(), "lastRegionId", 0);
        setField(term4320664, term4320664.getClass(), "lastRegionName", null);
        setField(term4320664, term4320664.getClass(), "lastClientId", null);
        setField(term4320664, term4320664.getClass(), "lastCountryCode", null);
        setIntField(term4320664, term4320664.getClass(), "lastSelectEMoney", 0);
        setIntField(term4320664, term4320664.getClass(), "lastSelectTicket", 0);
        setIntField(term4320664, term4320664.getClass(), "lastSelectCourse", 0);
        setIntField(term4320664, term4320664.getClass(), "lastCountCourse", 0);
        setField(term4320664, term4320664.getClass(), "firstGameId", null);
        setField(term4320664, term4320664.getClass(), "firstRomVersion", null);
        setField(term4320664, term4320664.getClass(), "firstDataVersion", null);
        setField(term4320664, term4320664.getClass(), "firstPlayDate", null);
        setField(term4320664, term4320664.getClass(), "compatibleCmVersion", null);
        setField(term4320664, term4320664.getClass(), "dailyBonusDate", null);
        setField(term4320664, term4320664.getClass(), "dailyCourseBonusDate", null);
        setField(term4320664, term4320664.getClass(), "lastPairLoginDate", null);
        setField(term4320664, term4320664.getClass(), "lastTrialPlayDate", null);
        setIntField(term4320664, term4320664.getClass(), "playVsCount", 0);
        setIntField(term4320664, term4320664.getClass(), "playSyncCount", 0);
        setIntField(term4320664, term4320664.getClass(), "winCount", 0);
        setIntField(term4320664, term4320664.getClass(), "helpCount", 0);
        setIntField(term4320664, term4320664.getClass(), "comboCount", 0);
        setLongField(term4320664, term4320664.getClass(), "totalDeluxscore", 0L);
        setLongField(term4320664, term4320664.getClass(), "totalBasicDeluxscore", 0L);
        setLongField(term4320664, term4320664.getClass(), "totalAdvancedDeluxscore", 0L);
        setLongField(term4320664, term4320664.getClass(), "totalExpertDeluxscore", 0L);
        setLongField(term4320664, term4320664.getClass(), "totalMasterDeluxscore", 0L);
        setLongField(term4320664, term4320664.getClass(), "totalReMasterDeluxscore", 0L);
        setIntField(term4320664, term4320664.getClass(), "totalSync", 0);
        setIntField(term4320664, term4320664.getClass(), "totalBasicSync", 0);
        setIntField(term4320664, term4320664.getClass(), "totalAdvancedSync", 0);
        setIntField(term4320664, term4320664.getClass(), "totalExpertSync", 0);
        setIntField(term4320664, term4320664.getClass(), "totalMasterSync", 0);
        setIntField(term4320664, term4320664.getClass(), "totalReMasterSync", 0);
        setLongField(term4320664, term4320664.getClass(), "totalAchievement", 0L);
        setLongField(term4320664, term4320664.getClass(), "totalBasicAchievement", 0L);
        setLongField(term4320664, term4320664.getClass(), "totalAdvancedAchievement", 0L);
        setLongField(term4320664, term4320664.getClass(), "totalExpertAchievement", 0L);
        setLongField(term4320664, term4320664.getClass(), "totalMasterAchievement", 0L);
        setLongField(term4320664, term4320664.getClass(), "totalReMasterAchievement", 0L);
        setLongField(term4320664, term4320664.getClass(), "playerOldRating", 0L);
        setLongField(term4320664, term4320664.getClass(), "playerNewRating", 0L);
        setIntField(term4320664, term4320664.getClass(), "banState", 0);
        setLongField(term4320664, term4320664.getClass(), "dateTime", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTitleId", argTypes, term4320664, args);
    }

};


