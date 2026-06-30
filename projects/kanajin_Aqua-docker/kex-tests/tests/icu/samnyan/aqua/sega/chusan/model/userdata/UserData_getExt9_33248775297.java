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

public class UserData_getExt9_33248775297 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term284443;

    public UserData_getExt9_33248775297() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term284443 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData"));
        setLongField(term284443, term284443.getClass(), "id", 0L);
        setField(term284443, term284443.getClass(), "card", null);
        setField(term284443, term284443.getClass(), "userName", null);
        setIntField(term284443, term284443.getClass(), "level", 0);
        setIntField(term284443, term284443.getClass(), "reincarnationNum", 0);
        setField(term284443, term284443.getClass(), "exp", null);
        setLongField(term284443, term284443.getClass(), "point", 0L);
        setLongField(term284443, term284443.getClass(), "totalPoint", 0L);
        setIntField(term284443, term284443.getClass(), "playCount", 0);
        setIntField(term284443, term284443.getClass(), "multiPlayCount", 0);
        setIntField(term284443, term284443.getClass(), "playerRating", 0);
        setIntField(term284443, term284443.getClass(), "highestRating", 0);
        setIntField(term284443, term284443.getClass(), "nameplateId", 0);
        setIntField(term284443, term284443.getClass(), "frameId", 0);
        setIntField(term284443, term284443.getClass(), "characterId", 0);
        setIntField(term284443, term284443.getClass(), "trophyId", 0);
        setIntField(term284443, term284443.getClass(), "playedTutorialBit", 0);
        setIntField(term284443, term284443.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term284443, term284443.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term284443, term284443.getClass(), "totalMapNum", 0);
        setLongField(term284443, term284443.getClass(), "totalHiScore", 0L);
        setLongField(term284443, term284443.getClass(), "totalBasicHighScore", 0L);
        setLongField(term284443, term284443.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term284443, term284443.getClass(), "totalExpertHighScore", 0L);
        setLongField(term284443, term284443.getClass(), "totalMasterHighScore", 0L);
        setLongField(term284443, term284443.getClass(), "totalUltimaHighScore", 0L);
        setField(term284443, term284443.getClass(), "eventWatchedDate", null);
        setIntField(term284443, term284443.getClass(), "friendCount", 0);
        setField(term284443, term284443.getClass(), "firstGameId", null);
        setField(term284443, term284443.getClass(), "firstRomVersion", null);
        setField(term284443, term284443.getClass(), "firstDataVersion", null);
        setField(term284443, term284443.getClass(), "firstPlayDate", null);
        setField(term284443, term284443.getClass(), "lastGameId", null);
        setField(term284443, term284443.getClass(), "lastRomVersion", null);
        setField(term284443, term284443.getClass(), "lastDataVersion", null);
        setField(term284443, term284443.getClass(), "lastLoginDate", null);
        setField(term284443, term284443.getClass(), "lastPlayDate", null);
        setIntField(term284443, term284443.getClass(), "lastPlaceId", 0);
        setField(term284443, term284443.getClass(), "lastPlaceName", null);
        setField(term284443, term284443.getClass(), "lastRegionId", null);
        setField(term284443, term284443.getClass(), "lastRegionName", null);
        setField(term284443, term284443.getClass(), "lastAllNetId", null);
        setField(term284443, term284443.getClass(), "lastClientId", null);
        setField(term284443, term284443.getClass(), "lastCountryCode", null);
        setField(term284443, term284443.getClass(), "userNameEx", null);
        setField(term284443, term284443.getClass(), "compatibleCmVersion", null);
        setIntField(term284443, term284443.getClass(), "medal", 0);
        setIntField(term284443, term284443.getClass(), "mapIconId", 0);
        setIntField(term284443, term284443.getClass(), "voiceId", 0);
        setIntField(term284443, term284443.getClass(), "avatarWear", 0);
        setIntField(term284443, term284443.getClass(), "avatarHead", 0);
        setIntField(term284443, term284443.getClass(), "avatarFace", 0);
        setIntField(term284443, term284443.getClass(), "avatarSkin", 0);
        setIntField(term284443, term284443.getClass(), "avatarItem", 0);
        setIntField(term284443, term284443.getClass(), "avatarFront", 0);
        setIntField(term284443, term284443.getClass(), "avatarBack", 0);
        setIntField(term284443, term284443.getClass(), "classEmblemBase", 0);
        setIntField(term284443, term284443.getClass(), "classEmblemMedal", 0);
        setIntField(term284443, term284443.getClass(), "stockedGridCount", 0);
        setIntField(term284443, term284443.getClass(), "exMapLoopCount", 0);
        setIntField(term284443, term284443.getClass(), "netBattlePlayCount", 0);
        setIntField(term284443, term284443.getClass(), "netBattleWinCount", 0);
        setIntField(term284443, term284443.getClass(), "netBattleLoseCount", 0);
        setIntField(term284443, term284443.getClass(), "netBattleConsecutiveWinCount", 0);
        setIntField(term284443, term284443.getClass(), "charaIllustId", 0);
        setIntField(term284443, term284443.getClass(), "skillId", 0);
        setIntField(term284443, term284443.getClass(), "overPowerPoint", 0);
        setIntField(term284443, term284443.getClass(), "overPowerRate", 0);
        setIntField(term284443, term284443.getClass(), "overPowerLowerRank", 0);
        setIntField(term284443, term284443.getClass(), "avatarPoint", 0);
        setIntField(term284443, term284443.getClass(), "battleRankId", 0);
        setIntField(term284443, term284443.getClass(), "battleRankPoint", 0);
        setIntField(term284443, term284443.getClass(), "eliteRankPoint", 0);
        setIntField(term284443, term284443.getClass(), "netBattle1stCount", 0);
        setIntField(term284443, term284443.getClass(), "netBattle2ndCount", 0);
        setIntField(term284443, term284443.getClass(), "netBattle3rdCount", 0);
        setIntField(term284443, term284443.getClass(), "netBattle4thCount", 0);
        setIntField(term284443, term284443.getClass(), "netBattleCorrection", 0);
        setIntField(term284443, term284443.getClass(), "netBattleErrCnt", 0);
        setIntField(term284443, term284443.getClass(), "netBattleHostErrCnt", 0);
        setIntField(term284443, term284443.getClass(), "battleRewardStatus", 0);
        setIntField(term284443, term284443.getClass(), "battleRewardIndex", 0);
        setIntField(term284443, term284443.getClass(), "battleRewardCount", 0);
        setIntField(term284443, term284443.getClass(), "ext1", 0);
        setIntField(term284443, term284443.getClass(), "ext2", 0);
        setIntField(term284443, term284443.getClass(), "ext3", 0);
        setIntField(term284443, term284443.getClass(), "ext4", 0);
        setIntField(term284443, term284443.getClass(), "ext5", 0);
        setIntField(term284443, term284443.getClass(), "ext6", 0);
        setIntField(term284443, term284443.getClass(), "ext7", 0);
        setIntField(term284443, term284443.getClass(), "ext8", 0);
        setIntField(term284443, term284443.getClass(), "ext9", 0);
        setIntField(term284443, term284443.getClass(), "ext10", 0);
        setField(term284443, term284443.getClass(), "extStr1", null);
        setField(term284443, term284443.getClass(), "extStr2", null);
        setLongField(term284443, term284443.getClass(), "extLong1", 0L);
        setLongField(term284443, term284443.getClass(), "extLong2", 0L);
        setField(term284443, term284443.getClass(), "rankUpChallengeResults", null);
        setBooleanField(term284443, term284443.getClass(), "isNetBattleHost", false);
        setIntField(term284443, term284443.getClass(), "netBattleEndState", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getExt9", argTypes, term284443, args);
    }

};


