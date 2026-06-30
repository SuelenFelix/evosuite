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

public class UserData_getNetBattleEndState_1807553838305 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term285059;

    public UserData_getNetBattleEndState_1807553838305() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term285059 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData"));
        setLongField(term285059, term285059.getClass(), "id", 0L);
        setField(term285059, term285059.getClass(), "card", null);
        setField(term285059, term285059.getClass(), "userName", null);
        setIntField(term285059, term285059.getClass(), "level", 0);
        setIntField(term285059, term285059.getClass(), "reincarnationNum", 0);
        setField(term285059, term285059.getClass(), "exp", null);
        setLongField(term285059, term285059.getClass(), "point", 0L);
        setLongField(term285059, term285059.getClass(), "totalPoint", 0L);
        setIntField(term285059, term285059.getClass(), "playCount", 0);
        setIntField(term285059, term285059.getClass(), "multiPlayCount", 0);
        setIntField(term285059, term285059.getClass(), "playerRating", 0);
        setIntField(term285059, term285059.getClass(), "highestRating", 0);
        setIntField(term285059, term285059.getClass(), "nameplateId", 0);
        setIntField(term285059, term285059.getClass(), "frameId", 0);
        setIntField(term285059, term285059.getClass(), "characterId", 0);
        setIntField(term285059, term285059.getClass(), "trophyId", 0);
        setIntField(term285059, term285059.getClass(), "playedTutorialBit", 0);
        setIntField(term285059, term285059.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term285059, term285059.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term285059, term285059.getClass(), "totalMapNum", 0);
        setLongField(term285059, term285059.getClass(), "totalHiScore", 0L);
        setLongField(term285059, term285059.getClass(), "totalBasicHighScore", 0L);
        setLongField(term285059, term285059.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term285059, term285059.getClass(), "totalExpertHighScore", 0L);
        setLongField(term285059, term285059.getClass(), "totalMasterHighScore", 0L);
        setLongField(term285059, term285059.getClass(), "totalUltimaHighScore", 0L);
        setField(term285059, term285059.getClass(), "eventWatchedDate", null);
        setIntField(term285059, term285059.getClass(), "friendCount", 0);
        setField(term285059, term285059.getClass(), "firstGameId", null);
        setField(term285059, term285059.getClass(), "firstRomVersion", null);
        setField(term285059, term285059.getClass(), "firstDataVersion", null);
        setField(term285059, term285059.getClass(), "firstPlayDate", null);
        setField(term285059, term285059.getClass(), "lastGameId", null);
        setField(term285059, term285059.getClass(), "lastRomVersion", null);
        setField(term285059, term285059.getClass(), "lastDataVersion", null);
        setField(term285059, term285059.getClass(), "lastLoginDate", null);
        setField(term285059, term285059.getClass(), "lastPlayDate", null);
        setIntField(term285059, term285059.getClass(), "lastPlaceId", 0);
        setField(term285059, term285059.getClass(), "lastPlaceName", null);
        setField(term285059, term285059.getClass(), "lastRegionId", null);
        setField(term285059, term285059.getClass(), "lastRegionName", null);
        setField(term285059, term285059.getClass(), "lastAllNetId", null);
        setField(term285059, term285059.getClass(), "lastClientId", null);
        setField(term285059, term285059.getClass(), "lastCountryCode", null);
        setField(term285059, term285059.getClass(), "userNameEx", null);
        setField(term285059, term285059.getClass(), "compatibleCmVersion", null);
        setIntField(term285059, term285059.getClass(), "medal", 0);
        setIntField(term285059, term285059.getClass(), "mapIconId", 0);
        setIntField(term285059, term285059.getClass(), "voiceId", 0);
        setIntField(term285059, term285059.getClass(), "avatarWear", 0);
        setIntField(term285059, term285059.getClass(), "avatarHead", 0);
        setIntField(term285059, term285059.getClass(), "avatarFace", 0);
        setIntField(term285059, term285059.getClass(), "avatarSkin", 0);
        setIntField(term285059, term285059.getClass(), "avatarItem", 0);
        setIntField(term285059, term285059.getClass(), "avatarFront", 0);
        setIntField(term285059, term285059.getClass(), "avatarBack", 0);
        setIntField(term285059, term285059.getClass(), "classEmblemBase", 0);
        setIntField(term285059, term285059.getClass(), "classEmblemMedal", 0);
        setIntField(term285059, term285059.getClass(), "stockedGridCount", 0);
        setIntField(term285059, term285059.getClass(), "exMapLoopCount", 0);
        setIntField(term285059, term285059.getClass(), "netBattlePlayCount", 0);
        setIntField(term285059, term285059.getClass(), "netBattleWinCount", 0);
        setIntField(term285059, term285059.getClass(), "netBattleLoseCount", 0);
        setIntField(term285059, term285059.getClass(), "netBattleConsecutiveWinCount", 0);
        setIntField(term285059, term285059.getClass(), "charaIllustId", 0);
        setIntField(term285059, term285059.getClass(), "skillId", 0);
        setIntField(term285059, term285059.getClass(), "overPowerPoint", 0);
        setIntField(term285059, term285059.getClass(), "overPowerRate", 0);
        setIntField(term285059, term285059.getClass(), "overPowerLowerRank", 0);
        setIntField(term285059, term285059.getClass(), "avatarPoint", 0);
        setIntField(term285059, term285059.getClass(), "battleRankId", 0);
        setIntField(term285059, term285059.getClass(), "battleRankPoint", 0);
        setIntField(term285059, term285059.getClass(), "eliteRankPoint", 0);
        setIntField(term285059, term285059.getClass(), "netBattle1stCount", 0);
        setIntField(term285059, term285059.getClass(), "netBattle2ndCount", 0);
        setIntField(term285059, term285059.getClass(), "netBattle3rdCount", 0);
        setIntField(term285059, term285059.getClass(), "netBattle4thCount", 0);
        setIntField(term285059, term285059.getClass(), "netBattleCorrection", 0);
        setIntField(term285059, term285059.getClass(), "netBattleErrCnt", 0);
        setIntField(term285059, term285059.getClass(), "netBattleHostErrCnt", 0);
        setIntField(term285059, term285059.getClass(), "battleRewardStatus", 0);
        setIntField(term285059, term285059.getClass(), "battleRewardIndex", 0);
        setIntField(term285059, term285059.getClass(), "battleRewardCount", 0);
        setIntField(term285059, term285059.getClass(), "ext1", 0);
        setIntField(term285059, term285059.getClass(), "ext2", 0);
        setIntField(term285059, term285059.getClass(), "ext3", 0);
        setIntField(term285059, term285059.getClass(), "ext4", 0);
        setIntField(term285059, term285059.getClass(), "ext5", 0);
        setIntField(term285059, term285059.getClass(), "ext6", 0);
        setIntField(term285059, term285059.getClass(), "ext7", 0);
        setIntField(term285059, term285059.getClass(), "ext8", 0);
        setIntField(term285059, term285059.getClass(), "ext9", 0);
        setIntField(term285059, term285059.getClass(), "ext10", 0);
        setField(term285059, term285059.getClass(), "extStr1", null);
        setField(term285059, term285059.getClass(), "extStr2", null);
        setLongField(term285059, term285059.getClass(), "extLong1", 0L);
        setLongField(term285059, term285059.getClass(), "extLong2", 0L);
        setField(term285059, term285059.getClass(), "rankUpChallengeResults", null);
        setBooleanField(term285059, term285059.getClass(), "isNetBattleHost", false);
        setIntField(term285059, term285059.getClass(), "netBattleEndState", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNetBattleEndState", argTypes, term285059, args);
    }

};


