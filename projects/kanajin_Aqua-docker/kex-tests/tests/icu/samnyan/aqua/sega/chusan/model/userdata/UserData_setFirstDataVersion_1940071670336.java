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

public class UserData_setFirstDataVersion_1940071670336 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term287494;

    public UserData_setFirstDataVersion_1940071670336() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term287494 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData"));
        setLongField(term287494, term287494.getClass(), "id", 0L);
        setField(term287494, term287494.getClass(), "card", null);
        setField(term287494, term287494.getClass(), "userName", null);
        setIntField(term287494, term287494.getClass(), "level", 0);
        setIntField(term287494, term287494.getClass(), "reincarnationNum", 0);
        setField(term287494, term287494.getClass(), "exp", null);
        setLongField(term287494, term287494.getClass(), "point", 0L);
        setLongField(term287494, term287494.getClass(), "totalPoint", 0L);
        setIntField(term287494, term287494.getClass(), "playCount", 0);
        setIntField(term287494, term287494.getClass(), "multiPlayCount", 0);
        setIntField(term287494, term287494.getClass(), "playerRating", 0);
        setIntField(term287494, term287494.getClass(), "highestRating", 0);
        setIntField(term287494, term287494.getClass(), "nameplateId", 0);
        setIntField(term287494, term287494.getClass(), "frameId", 0);
        setIntField(term287494, term287494.getClass(), "characterId", 0);
        setIntField(term287494, term287494.getClass(), "trophyId", 0);
        setIntField(term287494, term287494.getClass(), "playedTutorialBit", 0);
        setIntField(term287494, term287494.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term287494, term287494.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term287494, term287494.getClass(), "totalMapNum", 0);
        setLongField(term287494, term287494.getClass(), "totalHiScore", 0L);
        setLongField(term287494, term287494.getClass(), "totalBasicHighScore", 0L);
        setLongField(term287494, term287494.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term287494, term287494.getClass(), "totalExpertHighScore", 0L);
        setLongField(term287494, term287494.getClass(), "totalMasterHighScore", 0L);
        setLongField(term287494, term287494.getClass(), "totalUltimaHighScore", 0L);
        setField(term287494, term287494.getClass(), "eventWatchedDate", null);
        setIntField(term287494, term287494.getClass(), "friendCount", 0);
        setField(term287494, term287494.getClass(), "firstGameId", null);
        setField(term287494, term287494.getClass(), "firstRomVersion", null);
        setField(term287494, term287494.getClass(), "firstDataVersion", null);
        setField(term287494, term287494.getClass(), "firstPlayDate", null);
        setField(term287494, term287494.getClass(), "lastGameId", null);
        setField(term287494, term287494.getClass(), "lastRomVersion", null);
        setField(term287494, term287494.getClass(), "lastDataVersion", null);
        setField(term287494, term287494.getClass(), "lastLoginDate", null);
        setField(term287494, term287494.getClass(), "lastPlayDate", null);
        setIntField(term287494, term287494.getClass(), "lastPlaceId", 0);
        setField(term287494, term287494.getClass(), "lastPlaceName", null);
        setField(term287494, term287494.getClass(), "lastRegionId", null);
        setField(term287494, term287494.getClass(), "lastRegionName", null);
        setField(term287494, term287494.getClass(), "lastAllNetId", null);
        setField(term287494, term287494.getClass(), "lastClientId", null);
        setField(term287494, term287494.getClass(), "lastCountryCode", null);
        setField(term287494, term287494.getClass(), "userNameEx", null);
        setField(term287494, term287494.getClass(), "compatibleCmVersion", null);
        setIntField(term287494, term287494.getClass(), "medal", 0);
        setIntField(term287494, term287494.getClass(), "mapIconId", 0);
        setIntField(term287494, term287494.getClass(), "voiceId", 0);
        setIntField(term287494, term287494.getClass(), "avatarWear", 0);
        setIntField(term287494, term287494.getClass(), "avatarHead", 0);
        setIntField(term287494, term287494.getClass(), "avatarFace", 0);
        setIntField(term287494, term287494.getClass(), "avatarSkin", 0);
        setIntField(term287494, term287494.getClass(), "avatarItem", 0);
        setIntField(term287494, term287494.getClass(), "avatarFront", 0);
        setIntField(term287494, term287494.getClass(), "avatarBack", 0);
        setIntField(term287494, term287494.getClass(), "classEmblemBase", 0);
        setIntField(term287494, term287494.getClass(), "classEmblemMedal", 0);
        setIntField(term287494, term287494.getClass(), "stockedGridCount", 0);
        setIntField(term287494, term287494.getClass(), "exMapLoopCount", 0);
        setIntField(term287494, term287494.getClass(), "netBattlePlayCount", 0);
        setIntField(term287494, term287494.getClass(), "netBattleWinCount", 0);
        setIntField(term287494, term287494.getClass(), "netBattleLoseCount", 0);
        setIntField(term287494, term287494.getClass(), "netBattleConsecutiveWinCount", 0);
        setIntField(term287494, term287494.getClass(), "charaIllustId", 0);
        setIntField(term287494, term287494.getClass(), "skillId", 0);
        setIntField(term287494, term287494.getClass(), "overPowerPoint", 0);
        setIntField(term287494, term287494.getClass(), "overPowerRate", 0);
        setIntField(term287494, term287494.getClass(), "overPowerLowerRank", 0);
        setIntField(term287494, term287494.getClass(), "avatarPoint", 0);
        setIntField(term287494, term287494.getClass(), "battleRankId", 0);
        setIntField(term287494, term287494.getClass(), "battleRankPoint", 0);
        setIntField(term287494, term287494.getClass(), "eliteRankPoint", 0);
        setIntField(term287494, term287494.getClass(), "netBattle1stCount", 0);
        setIntField(term287494, term287494.getClass(), "netBattle2ndCount", 0);
        setIntField(term287494, term287494.getClass(), "netBattle3rdCount", 0);
        setIntField(term287494, term287494.getClass(), "netBattle4thCount", 0);
        setIntField(term287494, term287494.getClass(), "netBattleCorrection", 0);
        setIntField(term287494, term287494.getClass(), "netBattleErrCnt", 0);
        setIntField(term287494, term287494.getClass(), "netBattleHostErrCnt", 0);
        setIntField(term287494, term287494.getClass(), "battleRewardStatus", 0);
        setIntField(term287494, term287494.getClass(), "battleRewardIndex", 0);
        setIntField(term287494, term287494.getClass(), "battleRewardCount", 0);
        setIntField(term287494, term287494.getClass(), "ext1", 0);
        setIntField(term287494, term287494.getClass(), "ext2", 0);
        setIntField(term287494, term287494.getClass(), "ext3", 0);
        setIntField(term287494, term287494.getClass(), "ext4", 0);
        setIntField(term287494, term287494.getClass(), "ext5", 0);
        setIntField(term287494, term287494.getClass(), "ext6", 0);
        setIntField(term287494, term287494.getClass(), "ext7", 0);
        setIntField(term287494, term287494.getClass(), "ext8", 0);
        setIntField(term287494, term287494.getClass(), "ext9", 0);
        setIntField(term287494, term287494.getClass(), "ext10", 0);
        setField(term287494, term287494.getClass(), "extStr1", null);
        setField(term287494, term287494.getClass(), "extStr2", null);
        setLongField(term287494, term287494.getClass(), "extLong1", 0L);
        setLongField(term287494, term287494.getClass(), "extLong2", 0L);
        setField(term287494, term287494.getClass(), "rankUpChallengeResults", null);
        setBooleanField(term287494, term287494.getClass(), "isNetBattleHost", false);
        setIntField(term287494, term287494.getClass(), "netBattleEndState", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setFirstDataVersion", argTypes, term287494, args);
    }

};


