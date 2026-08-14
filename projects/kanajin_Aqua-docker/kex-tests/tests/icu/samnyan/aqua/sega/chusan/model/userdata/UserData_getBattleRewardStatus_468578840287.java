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

public class UserData_getBattleRewardStatus_468578840287 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4218197;

    public UserData_getBattleRewardStatus_468578840287() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4218197 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData"));
        setLongField(term4218197, term4218197.getClass(), "id", 0L);
        setField(term4218197, term4218197.getClass(), "card", null);
        setField(term4218197, term4218197.getClass(), "userName", null);
        setIntField(term4218197, term4218197.getClass(), "level", 0);
        setIntField(term4218197, term4218197.getClass(), "reincarnationNum", 0);
        setField(term4218197, term4218197.getClass(), "exp", null);
        setLongField(term4218197, term4218197.getClass(), "point", 0L);
        setLongField(term4218197, term4218197.getClass(), "totalPoint", 0L);
        setIntField(term4218197, term4218197.getClass(), "playCount", 0);
        setIntField(term4218197, term4218197.getClass(), "multiPlayCount", 0);
        setIntField(term4218197, term4218197.getClass(), "playerRating", 0);
        setIntField(term4218197, term4218197.getClass(), "highestRating", 0);
        setIntField(term4218197, term4218197.getClass(), "nameplateId", 0);
        setIntField(term4218197, term4218197.getClass(), "frameId", 0);
        setIntField(term4218197, term4218197.getClass(), "characterId", 0);
        setIntField(term4218197, term4218197.getClass(), "trophyId", 0);
        setIntField(term4218197, term4218197.getClass(), "playedTutorialBit", 0);
        setIntField(term4218197, term4218197.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term4218197, term4218197.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term4218197, term4218197.getClass(), "totalMapNum", 0);
        setLongField(term4218197, term4218197.getClass(), "totalHiScore", 0L);
        setLongField(term4218197, term4218197.getClass(), "totalBasicHighScore", 0L);
        setLongField(term4218197, term4218197.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term4218197, term4218197.getClass(), "totalExpertHighScore", 0L);
        setLongField(term4218197, term4218197.getClass(), "totalMasterHighScore", 0L);
        setLongField(term4218197, term4218197.getClass(), "totalUltimaHighScore", 0L);
        setField(term4218197, term4218197.getClass(), "eventWatchedDate", null);
        setIntField(term4218197, term4218197.getClass(), "friendCount", 0);
        setField(term4218197, term4218197.getClass(), "firstGameId", null);
        setField(term4218197, term4218197.getClass(), "firstRomVersion", null);
        setField(term4218197, term4218197.getClass(), "firstDataVersion", null);
        setField(term4218197, term4218197.getClass(), "firstPlayDate", null);
        setField(term4218197, term4218197.getClass(), "lastGameId", null);
        setField(term4218197, term4218197.getClass(), "lastRomVersion", null);
        setField(term4218197, term4218197.getClass(), "lastDataVersion", null);
        setField(term4218197, term4218197.getClass(), "lastLoginDate", null);
        setField(term4218197, term4218197.getClass(), "lastPlayDate", null);
        setIntField(term4218197, term4218197.getClass(), "lastPlaceId", 0);
        setField(term4218197, term4218197.getClass(), "lastPlaceName", null);
        setField(term4218197, term4218197.getClass(), "lastRegionId", null);
        setField(term4218197, term4218197.getClass(), "lastRegionName", null);
        setField(term4218197, term4218197.getClass(), "lastAllNetId", null);
        setField(term4218197, term4218197.getClass(), "lastClientId", null);
        setField(term4218197, term4218197.getClass(), "lastCountryCode", null);
        setField(term4218197, term4218197.getClass(), "userNameEx", null);
        setField(term4218197, term4218197.getClass(), "compatibleCmVersion", null);
        setIntField(term4218197, term4218197.getClass(), "medal", 0);
        setIntField(term4218197, term4218197.getClass(), "mapIconId", 0);
        setIntField(term4218197, term4218197.getClass(), "voiceId", 0);
        setIntField(term4218197, term4218197.getClass(), "avatarWear", 0);
        setIntField(term4218197, term4218197.getClass(), "avatarHead", 0);
        setIntField(term4218197, term4218197.getClass(), "avatarFace", 0);
        setIntField(term4218197, term4218197.getClass(), "avatarSkin", 0);
        setIntField(term4218197, term4218197.getClass(), "avatarItem", 0);
        setIntField(term4218197, term4218197.getClass(), "avatarFront", 0);
        setIntField(term4218197, term4218197.getClass(), "avatarBack", 0);
        setIntField(term4218197, term4218197.getClass(), "classEmblemBase", 0);
        setIntField(term4218197, term4218197.getClass(), "classEmblemMedal", 0);
        setIntField(term4218197, term4218197.getClass(), "stockedGridCount", 0);
        setIntField(term4218197, term4218197.getClass(), "exMapLoopCount", 0);
        setIntField(term4218197, term4218197.getClass(), "netBattlePlayCount", 0);
        setIntField(term4218197, term4218197.getClass(), "netBattleWinCount", 0);
        setIntField(term4218197, term4218197.getClass(), "netBattleLoseCount", 0);
        setIntField(term4218197, term4218197.getClass(), "netBattleConsecutiveWinCount", 0);
        setIntField(term4218197, term4218197.getClass(), "charaIllustId", 0);
        setIntField(term4218197, term4218197.getClass(), "skillId", 0);
        setIntField(term4218197, term4218197.getClass(), "overPowerPoint", 0);
        setIntField(term4218197, term4218197.getClass(), "overPowerRate", 0);
        setIntField(term4218197, term4218197.getClass(), "overPowerLowerRank", 0);
        setIntField(term4218197, term4218197.getClass(), "avatarPoint", 0);
        setIntField(term4218197, term4218197.getClass(), "battleRankId", 0);
        setIntField(term4218197, term4218197.getClass(), "battleRankPoint", 0);
        setIntField(term4218197, term4218197.getClass(), "eliteRankPoint", 0);
        setIntField(term4218197, term4218197.getClass(), "netBattle1stCount", 0);
        setIntField(term4218197, term4218197.getClass(), "netBattle2ndCount", 0);
        setIntField(term4218197, term4218197.getClass(), "netBattle3rdCount", 0);
        setIntField(term4218197, term4218197.getClass(), "netBattle4thCount", 0);
        setIntField(term4218197, term4218197.getClass(), "netBattleCorrection", 0);
        setIntField(term4218197, term4218197.getClass(), "netBattleErrCnt", 0);
        setIntField(term4218197, term4218197.getClass(), "netBattleHostErrCnt", 0);
        setIntField(term4218197, term4218197.getClass(), "battleRewardStatus", 0);
        setIntField(term4218197, term4218197.getClass(), "battleRewardIndex", 0);
        setIntField(term4218197, term4218197.getClass(), "battleRewardCount", 0);
        setIntField(term4218197, term4218197.getClass(), "ext1", 0);
        setIntField(term4218197, term4218197.getClass(), "ext2", 0);
        setIntField(term4218197, term4218197.getClass(), "ext3", 0);
        setIntField(term4218197, term4218197.getClass(), "ext4", 0);
        setIntField(term4218197, term4218197.getClass(), "ext5", 0);
        setIntField(term4218197, term4218197.getClass(), "ext6", 0);
        setIntField(term4218197, term4218197.getClass(), "ext7", 0);
        setIntField(term4218197, term4218197.getClass(), "ext8", 0);
        setIntField(term4218197, term4218197.getClass(), "ext9", 0);
        setIntField(term4218197, term4218197.getClass(), "ext10", 0);
        setField(term4218197, term4218197.getClass(), "extStr1", null);
        setField(term4218197, term4218197.getClass(), "extStr2", null);
        setLongField(term4218197, term4218197.getClass(), "extLong1", 0L);
        setLongField(term4218197, term4218197.getClass(), "extLong2", 0L);
        setField(term4218197, term4218197.getClass(), "rankUpChallengeResults", null);
        setBooleanField(term4218197, term4218197.getClass(), "isNetBattleHost", false);
        setIntField(term4218197, term4218197.getClass(), "netBattleEndState", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBattleRewardStatus", argTypes, term4218197, args);
    }

};


