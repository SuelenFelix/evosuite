package icu.samnyan.aqua.sega.chusan.model.userdata;

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
import static icu.samnyan.aqua.sega.chusan.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;

public class UserData_setId_1614603660306 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term285136;
     Object term285213;

    public UserData_setId_1614603660306() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term285136 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData"));
        setLongField(term285136, term285136.getClass(), "id", 0L);
        setField(term285136, term285136.getClass(), "card", null);
        setField(term285136, term285136.getClass(), "userName", null);
        setIntField(term285136, term285136.getClass(), "level", 0);
        setIntField(term285136, term285136.getClass(), "reincarnationNum", 0);
        setField(term285136, term285136.getClass(), "exp", null);
        setLongField(term285136, term285136.getClass(), "point", 0L);
        setLongField(term285136, term285136.getClass(), "totalPoint", 0L);
        setIntField(term285136, term285136.getClass(), "playCount", 0);
        setIntField(term285136, term285136.getClass(), "multiPlayCount", 0);
        setIntField(term285136, term285136.getClass(), "playerRating", 0);
        setIntField(term285136, term285136.getClass(), "highestRating", 0);
        setIntField(term285136, term285136.getClass(), "nameplateId", 0);
        setIntField(term285136, term285136.getClass(), "frameId", 0);
        setIntField(term285136, term285136.getClass(), "characterId", 0);
        setIntField(term285136, term285136.getClass(), "trophyId", 0);
        setIntField(term285136, term285136.getClass(), "playedTutorialBit", 0);
        setIntField(term285136, term285136.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term285136, term285136.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term285136, term285136.getClass(), "totalMapNum", 0);
        setLongField(term285136, term285136.getClass(), "totalHiScore", 0L);
        setLongField(term285136, term285136.getClass(), "totalBasicHighScore", 0L);
        setLongField(term285136, term285136.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term285136, term285136.getClass(), "totalExpertHighScore", 0L);
        setLongField(term285136, term285136.getClass(), "totalMasterHighScore", 0L);
        setLongField(term285136, term285136.getClass(), "totalUltimaHighScore", 0L);
        setField(term285136, term285136.getClass(), "eventWatchedDate", null);
        setIntField(term285136, term285136.getClass(), "friendCount", 0);
        setField(term285136, term285136.getClass(), "firstGameId", null);
        setField(term285136, term285136.getClass(), "firstRomVersion", null);
        setField(term285136, term285136.getClass(), "firstDataVersion", null);
        setField(term285136, term285136.getClass(), "firstPlayDate", null);
        setField(term285136, term285136.getClass(), "lastGameId", null);
        setField(term285136, term285136.getClass(), "lastRomVersion", null);
        setField(term285136, term285136.getClass(), "lastDataVersion", null);
        setField(term285136, term285136.getClass(), "lastLoginDate", null);
        setField(term285136, term285136.getClass(), "lastPlayDate", null);
        setIntField(term285136, term285136.getClass(), "lastPlaceId", 0);
        setField(term285136, term285136.getClass(), "lastPlaceName", null);
        setField(term285136, term285136.getClass(), "lastRegionId", null);
        setField(term285136, term285136.getClass(), "lastRegionName", null);
        setField(term285136, term285136.getClass(), "lastAllNetId", null);
        setField(term285136, term285136.getClass(), "lastClientId", null);
        setField(term285136, term285136.getClass(), "lastCountryCode", null);
        setField(term285136, term285136.getClass(), "userNameEx", null);
        setField(term285136, term285136.getClass(), "compatibleCmVersion", null);
        setIntField(term285136, term285136.getClass(), "medal", 0);
        setIntField(term285136, term285136.getClass(), "mapIconId", 0);
        setIntField(term285136, term285136.getClass(), "voiceId", 0);
        setIntField(term285136, term285136.getClass(), "avatarWear", 0);
        setIntField(term285136, term285136.getClass(), "avatarHead", 0);
        setIntField(term285136, term285136.getClass(), "avatarFace", 0);
        setIntField(term285136, term285136.getClass(), "avatarSkin", 0);
        setIntField(term285136, term285136.getClass(), "avatarItem", 0);
        setIntField(term285136, term285136.getClass(), "avatarFront", 0);
        setIntField(term285136, term285136.getClass(), "avatarBack", 0);
        setIntField(term285136, term285136.getClass(), "classEmblemBase", 0);
        setIntField(term285136, term285136.getClass(), "classEmblemMedal", 0);
        setIntField(term285136, term285136.getClass(), "stockedGridCount", 0);
        setIntField(term285136, term285136.getClass(), "exMapLoopCount", 0);
        setIntField(term285136, term285136.getClass(), "netBattlePlayCount", 0);
        setIntField(term285136, term285136.getClass(), "netBattleWinCount", 0);
        setIntField(term285136, term285136.getClass(), "netBattleLoseCount", 0);
        setIntField(term285136, term285136.getClass(), "netBattleConsecutiveWinCount", 0);
        setIntField(term285136, term285136.getClass(), "charaIllustId", 0);
        setIntField(term285136, term285136.getClass(), "skillId", 0);
        setIntField(term285136, term285136.getClass(), "overPowerPoint", 0);
        setIntField(term285136, term285136.getClass(), "overPowerRate", 0);
        setIntField(term285136, term285136.getClass(), "overPowerLowerRank", 0);
        setIntField(term285136, term285136.getClass(), "avatarPoint", 0);
        setIntField(term285136, term285136.getClass(), "battleRankId", 0);
        setIntField(term285136, term285136.getClass(), "battleRankPoint", 0);
        setIntField(term285136, term285136.getClass(), "eliteRankPoint", 0);
        setIntField(term285136, term285136.getClass(), "netBattle1stCount", 0);
        setIntField(term285136, term285136.getClass(), "netBattle2ndCount", 0);
        setIntField(term285136, term285136.getClass(), "netBattle3rdCount", 0);
        setIntField(term285136, term285136.getClass(), "netBattle4thCount", 0);
        setIntField(term285136, term285136.getClass(), "netBattleCorrection", 0);
        setIntField(term285136, term285136.getClass(), "netBattleErrCnt", 0);
        setIntField(term285136, term285136.getClass(), "netBattleHostErrCnt", 0);
        setIntField(term285136, term285136.getClass(), "battleRewardStatus", 0);
        setIntField(term285136, term285136.getClass(), "battleRewardIndex", 0);
        setIntField(term285136, term285136.getClass(), "battleRewardCount", 0);
        setIntField(term285136, term285136.getClass(), "ext1", 0);
        setIntField(term285136, term285136.getClass(), "ext2", 0);
        setIntField(term285136, term285136.getClass(), "ext3", 0);
        setIntField(term285136, term285136.getClass(), "ext4", 0);
        setIntField(term285136, term285136.getClass(), "ext5", 0);
        setIntField(term285136, term285136.getClass(), "ext6", 0);
        setIntField(term285136, term285136.getClass(), "ext7", 0);
        setIntField(term285136, term285136.getClass(), "ext8", 0);
        setIntField(term285136, term285136.getClass(), "ext9", 0);
        setIntField(term285136, term285136.getClass(), "ext10", 0);
        setField(term285136, term285136.getClass(), "extStr1", null);
        setField(term285136, term285136.getClass(), "extStr2", null);
        setLongField(term285136, term285136.getClass(), "extLong1", 0L);
        setLongField(term285136, term285136.getClass(), "extLong2", 0L);
        setField(term285136, term285136.getClass(), "rankUpChallengeResults", null);
        setBooleanField(term285136, term285136.getClass(), "isNetBattleHost", false);
        setIntField(term285136, term285136.getClass(), "netBattleEndState", 0);
        term285213 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term285213;
        callMethod(klass, "setId", argTypes, term285136, args);
    }

};


