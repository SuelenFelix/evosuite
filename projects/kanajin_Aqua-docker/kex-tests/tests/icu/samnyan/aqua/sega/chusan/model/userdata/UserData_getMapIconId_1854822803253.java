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

public class UserData_getMapIconId_1854822803253 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term281055;

    public UserData_getMapIconId_1854822803253() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term281055 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData"));
        setLongField(term281055, term281055.getClass(), "id", 0L);
        setField(term281055, term281055.getClass(), "card", null);
        setField(term281055, term281055.getClass(), "userName", null);
        setIntField(term281055, term281055.getClass(), "level", 0);
        setIntField(term281055, term281055.getClass(), "reincarnationNum", 0);
        setField(term281055, term281055.getClass(), "exp", null);
        setLongField(term281055, term281055.getClass(), "point", 0L);
        setLongField(term281055, term281055.getClass(), "totalPoint", 0L);
        setIntField(term281055, term281055.getClass(), "playCount", 0);
        setIntField(term281055, term281055.getClass(), "multiPlayCount", 0);
        setIntField(term281055, term281055.getClass(), "playerRating", 0);
        setIntField(term281055, term281055.getClass(), "highestRating", 0);
        setIntField(term281055, term281055.getClass(), "nameplateId", 0);
        setIntField(term281055, term281055.getClass(), "frameId", 0);
        setIntField(term281055, term281055.getClass(), "characterId", 0);
        setIntField(term281055, term281055.getClass(), "trophyId", 0);
        setIntField(term281055, term281055.getClass(), "playedTutorialBit", 0);
        setIntField(term281055, term281055.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term281055, term281055.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term281055, term281055.getClass(), "totalMapNum", 0);
        setLongField(term281055, term281055.getClass(), "totalHiScore", 0L);
        setLongField(term281055, term281055.getClass(), "totalBasicHighScore", 0L);
        setLongField(term281055, term281055.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term281055, term281055.getClass(), "totalExpertHighScore", 0L);
        setLongField(term281055, term281055.getClass(), "totalMasterHighScore", 0L);
        setLongField(term281055, term281055.getClass(), "totalUltimaHighScore", 0L);
        setField(term281055, term281055.getClass(), "eventWatchedDate", null);
        setIntField(term281055, term281055.getClass(), "friendCount", 0);
        setField(term281055, term281055.getClass(), "firstGameId", null);
        setField(term281055, term281055.getClass(), "firstRomVersion", null);
        setField(term281055, term281055.getClass(), "firstDataVersion", null);
        setField(term281055, term281055.getClass(), "firstPlayDate", null);
        setField(term281055, term281055.getClass(), "lastGameId", null);
        setField(term281055, term281055.getClass(), "lastRomVersion", null);
        setField(term281055, term281055.getClass(), "lastDataVersion", null);
        setField(term281055, term281055.getClass(), "lastLoginDate", null);
        setField(term281055, term281055.getClass(), "lastPlayDate", null);
        setIntField(term281055, term281055.getClass(), "lastPlaceId", 0);
        setField(term281055, term281055.getClass(), "lastPlaceName", null);
        setField(term281055, term281055.getClass(), "lastRegionId", null);
        setField(term281055, term281055.getClass(), "lastRegionName", null);
        setField(term281055, term281055.getClass(), "lastAllNetId", null);
        setField(term281055, term281055.getClass(), "lastClientId", null);
        setField(term281055, term281055.getClass(), "lastCountryCode", null);
        setField(term281055, term281055.getClass(), "userNameEx", null);
        setField(term281055, term281055.getClass(), "compatibleCmVersion", null);
        setIntField(term281055, term281055.getClass(), "medal", 0);
        setIntField(term281055, term281055.getClass(), "mapIconId", 0);
        setIntField(term281055, term281055.getClass(), "voiceId", 0);
        setIntField(term281055, term281055.getClass(), "avatarWear", 0);
        setIntField(term281055, term281055.getClass(), "avatarHead", 0);
        setIntField(term281055, term281055.getClass(), "avatarFace", 0);
        setIntField(term281055, term281055.getClass(), "avatarSkin", 0);
        setIntField(term281055, term281055.getClass(), "avatarItem", 0);
        setIntField(term281055, term281055.getClass(), "avatarFront", 0);
        setIntField(term281055, term281055.getClass(), "avatarBack", 0);
        setIntField(term281055, term281055.getClass(), "classEmblemBase", 0);
        setIntField(term281055, term281055.getClass(), "classEmblemMedal", 0);
        setIntField(term281055, term281055.getClass(), "stockedGridCount", 0);
        setIntField(term281055, term281055.getClass(), "exMapLoopCount", 0);
        setIntField(term281055, term281055.getClass(), "netBattlePlayCount", 0);
        setIntField(term281055, term281055.getClass(), "netBattleWinCount", 0);
        setIntField(term281055, term281055.getClass(), "netBattleLoseCount", 0);
        setIntField(term281055, term281055.getClass(), "netBattleConsecutiveWinCount", 0);
        setIntField(term281055, term281055.getClass(), "charaIllustId", 0);
        setIntField(term281055, term281055.getClass(), "skillId", 0);
        setIntField(term281055, term281055.getClass(), "overPowerPoint", 0);
        setIntField(term281055, term281055.getClass(), "overPowerRate", 0);
        setIntField(term281055, term281055.getClass(), "overPowerLowerRank", 0);
        setIntField(term281055, term281055.getClass(), "avatarPoint", 0);
        setIntField(term281055, term281055.getClass(), "battleRankId", 0);
        setIntField(term281055, term281055.getClass(), "battleRankPoint", 0);
        setIntField(term281055, term281055.getClass(), "eliteRankPoint", 0);
        setIntField(term281055, term281055.getClass(), "netBattle1stCount", 0);
        setIntField(term281055, term281055.getClass(), "netBattle2ndCount", 0);
        setIntField(term281055, term281055.getClass(), "netBattle3rdCount", 0);
        setIntField(term281055, term281055.getClass(), "netBattle4thCount", 0);
        setIntField(term281055, term281055.getClass(), "netBattleCorrection", 0);
        setIntField(term281055, term281055.getClass(), "netBattleErrCnt", 0);
        setIntField(term281055, term281055.getClass(), "netBattleHostErrCnt", 0);
        setIntField(term281055, term281055.getClass(), "battleRewardStatus", 0);
        setIntField(term281055, term281055.getClass(), "battleRewardIndex", 0);
        setIntField(term281055, term281055.getClass(), "battleRewardCount", 0);
        setIntField(term281055, term281055.getClass(), "ext1", 0);
        setIntField(term281055, term281055.getClass(), "ext2", 0);
        setIntField(term281055, term281055.getClass(), "ext3", 0);
        setIntField(term281055, term281055.getClass(), "ext4", 0);
        setIntField(term281055, term281055.getClass(), "ext5", 0);
        setIntField(term281055, term281055.getClass(), "ext6", 0);
        setIntField(term281055, term281055.getClass(), "ext7", 0);
        setIntField(term281055, term281055.getClass(), "ext8", 0);
        setIntField(term281055, term281055.getClass(), "ext9", 0);
        setIntField(term281055, term281055.getClass(), "ext10", 0);
        setField(term281055, term281055.getClass(), "extStr1", null);
        setField(term281055, term281055.getClass(), "extStr2", null);
        setLongField(term281055, term281055.getClass(), "extLong1", 0L);
        setLongField(term281055, term281055.getClass(), "extLong2", 0L);
        setField(term281055, term281055.getClass(), "rankUpChallengeResults", null);
        setBooleanField(term281055, term281055.getClass(), "isNetBattleHost", false);
        setIntField(term281055, term281055.getClass(), "netBattleEndState", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMapIconId", argTypes, term281055, args);
    }

};


