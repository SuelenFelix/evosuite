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

public class UserData_getMapIconId_1854822803254 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4215656;

    public UserData_getMapIconId_1854822803254() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4215656 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData"));
        setLongField(term4215656, term4215656.getClass(), "id", 0L);
        setField(term4215656, term4215656.getClass(), "card", null);
        setField(term4215656, term4215656.getClass(), "userName", null);
        setIntField(term4215656, term4215656.getClass(), "level", 0);
        setIntField(term4215656, term4215656.getClass(), "reincarnationNum", 0);
        setField(term4215656, term4215656.getClass(), "exp", null);
        setLongField(term4215656, term4215656.getClass(), "point", 0L);
        setLongField(term4215656, term4215656.getClass(), "totalPoint", 0L);
        setIntField(term4215656, term4215656.getClass(), "playCount", 0);
        setIntField(term4215656, term4215656.getClass(), "multiPlayCount", 0);
        setIntField(term4215656, term4215656.getClass(), "playerRating", 0);
        setIntField(term4215656, term4215656.getClass(), "highestRating", 0);
        setIntField(term4215656, term4215656.getClass(), "nameplateId", 0);
        setIntField(term4215656, term4215656.getClass(), "frameId", 0);
        setIntField(term4215656, term4215656.getClass(), "characterId", 0);
        setIntField(term4215656, term4215656.getClass(), "trophyId", 0);
        setIntField(term4215656, term4215656.getClass(), "playedTutorialBit", 0);
        setIntField(term4215656, term4215656.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term4215656, term4215656.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term4215656, term4215656.getClass(), "totalMapNum", 0);
        setLongField(term4215656, term4215656.getClass(), "totalHiScore", 0L);
        setLongField(term4215656, term4215656.getClass(), "totalBasicHighScore", 0L);
        setLongField(term4215656, term4215656.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term4215656, term4215656.getClass(), "totalExpertHighScore", 0L);
        setLongField(term4215656, term4215656.getClass(), "totalMasterHighScore", 0L);
        setLongField(term4215656, term4215656.getClass(), "totalUltimaHighScore", 0L);
        setField(term4215656, term4215656.getClass(), "eventWatchedDate", null);
        setIntField(term4215656, term4215656.getClass(), "friendCount", 0);
        setField(term4215656, term4215656.getClass(), "firstGameId", null);
        setField(term4215656, term4215656.getClass(), "firstRomVersion", null);
        setField(term4215656, term4215656.getClass(), "firstDataVersion", null);
        setField(term4215656, term4215656.getClass(), "firstPlayDate", null);
        setField(term4215656, term4215656.getClass(), "lastGameId", null);
        setField(term4215656, term4215656.getClass(), "lastRomVersion", null);
        setField(term4215656, term4215656.getClass(), "lastDataVersion", null);
        setField(term4215656, term4215656.getClass(), "lastLoginDate", null);
        setField(term4215656, term4215656.getClass(), "lastPlayDate", null);
        setIntField(term4215656, term4215656.getClass(), "lastPlaceId", 0);
        setField(term4215656, term4215656.getClass(), "lastPlaceName", null);
        setField(term4215656, term4215656.getClass(), "lastRegionId", null);
        setField(term4215656, term4215656.getClass(), "lastRegionName", null);
        setField(term4215656, term4215656.getClass(), "lastAllNetId", null);
        setField(term4215656, term4215656.getClass(), "lastClientId", null);
        setField(term4215656, term4215656.getClass(), "lastCountryCode", null);
        setField(term4215656, term4215656.getClass(), "userNameEx", null);
        setField(term4215656, term4215656.getClass(), "compatibleCmVersion", null);
        setIntField(term4215656, term4215656.getClass(), "medal", 0);
        setIntField(term4215656, term4215656.getClass(), "mapIconId", 0);
        setIntField(term4215656, term4215656.getClass(), "voiceId", 0);
        setIntField(term4215656, term4215656.getClass(), "avatarWear", 0);
        setIntField(term4215656, term4215656.getClass(), "avatarHead", 0);
        setIntField(term4215656, term4215656.getClass(), "avatarFace", 0);
        setIntField(term4215656, term4215656.getClass(), "avatarSkin", 0);
        setIntField(term4215656, term4215656.getClass(), "avatarItem", 0);
        setIntField(term4215656, term4215656.getClass(), "avatarFront", 0);
        setIntField(term4215656, term4215656.getClass(), "avatarBack", 0);
        setIntField(term4215656, term4215656.getClass(), "classEmblemBase", 0);
        setIntField(term4215656, term4215656.getClass(), "classEmblemMedal", 0);
        setIntField(term4215656, term4215656.getClass(), "stockedGridCount", 0);
        setIntField(term4215656, term4215656.getClass(), "exMapLoopCount", 0);
        setIntField(term4215656, term4215656.getClass(), "netBattlePlayCount", 0);
        setIntField(term4215656, term4215656.getClass(), "netBattleWinCount", 0);
        setIntField(term4215656, term4215656.getClass(), "netBattleLoseCount", 0);
        setIntField(term4215656, term4215656.getClass(), "netBattleConsecutiveWinCount", 0);
        setIntField(term4215656, term4215656.getClass(), "charaIllustId", 0);
        setIntField(term4215656, term4215656.getClass(), "skillId", 0);
        setIntField(term4215656, term4215656.getClass(), "overPowerPoint", 0);
        setIntField(term4215656, term4215656.getClass(), "overPowerRate", 0);
        setIntField(term4215656, term4215656.getClass(), "overPowerLowerRank", 0);
        setIntField(term4215656, term4215656.getClass(), "avatarPoint", 0);
        setIntField(term4215656, term4215656.getClass(), "battleRankId", 0);
        setIntField(term4215656, term4215656.getClass(), "battleRankPoint", 0);
        setIntField(term4215656, term4215656.getClass(), "eliteRankPoint", 0);
        setIntField(term4215656, term4215656.getClass(), "netBattle1stCount", 0);
        setIntField(term4215656, term4215656.getClass(), "netBattle2ndCount", 0);
        setIntField(term4215656, term4215656.getClass(), "netBattle3rdCount", 0);
        setIntField(term4215656, term4215656.getClass(), "netBattle4thCount", 0);
        setIntField(term4215656, term4215656.getClass(), "netBattleCorrection", 0);
        setIntField(term4215656, term4215656.getClass(), "netBattleErrCnt", 0);
        setIntField(term4215656, term4215656.getClass(), "netBattleHostErrCnt", 0);
        setIntField(term4215656, term4215656.getClass(), "battleRewardStatus", 0);
        setIntField(term4215656, term4215656.getClass(), "battleRewardIndex", 0);
        setIntField(term4215656, term4215656.getClass(), "battleRewardCount", 0);
        setIntField(term4215656, term4215656.getClass(), "ext1", 0);
        setIntField(term4215656, term4215656.getClass(), "ext2", 0);
        setIntField(term4215656, term4215656.getClass(), "ext3", 0);
        setIntField(term4215656, term4215656.getClass(), "ext4", 0);
        setIntField(term4215656, term4215656.getClass(), "ext5", 0);
        setIntField(term4215656, term4215656.getClass(), "ext6", 0);
        setIntField(term4215656, term4215656.getClass(), "ext7", 0);
        setIntField(term4215656, term4215656.getClass(), "ext8", 0);
        setIntField(term4215656, term4215656.getClass(), "ext9", 0);
        setIntField(term4215656, term4215656.getClass(), "ext10", 0);
        setField(term4215656, term4215656.getClass(), "extStr1", null);
        setField(term4215656, term4215656.getClass(), "extStr2", null);
        setLongField(term4215656, term4215656.getClass(), "extLong1", 0L);
        setLongField(term4215656, term4215656.getClass(), "extLong2", 0L);
        setField(term4215656, term4215656.getClass(), "rankUpChallengeResults", null);
        setBooleanField(term4215656, term4215656.getClass(), "isNetBattleHost", false);
        setIntField(term4215656, term4215656.getClass(), "netBattleEndState", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMapIconId", argTypes, term4215656, args);
    }

};


