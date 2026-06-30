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

public class UserData_getTotalAdvancedHighScore_1679773465228 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term279130;

    public UserData_getTotalAdvancedHighScore_1679773465228() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term279130 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData"));
        setLongField(term279130, term279130.getClass(), "id", 0L);
        setField(term279130, term279130.getClass(), "card", null);
        setField(term279130, term279130.getClass(), "userName", null);
        setIntField(term279130, term279130.getClass(), "level", 0);
        setIntField(term279130, term279130.getClass(), "reincarnationNum", 0);
        setField(term279130, term279130.getClass(), "exp", null);
        setLongField(term279130, term279130.getClass(), "point", 0L);
        setLongField(term279130, term279130.getClass(), "totalPoint", 0L);
        setIntField(term279130, term279130.getClass(), "playCount", 0);
        setIntField(term279130, term279130.getClass(), "multiPlayCount", 0);
        setIntField(term279130, term279130.getClass(), "playerRating", 0);
        setIntField(term279130, term279130.getClass(), "highestRating", 0);
        setIntField(term279130, term279130.getClass(), "nameplateId", 0);
        setIntField(term279130, term279130.getClass(), "frameId", 0);
        setIntField(term279130, term279130.getClass(), "characterId", 0);
        setIntField(term279130, term279130.getClass(), "trophyId", 0);
        setIntField(term279130, term279130.getClass(), "playedTutorialBit", 0);
        setIntField(term279130, term279130.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term279130, term279130.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term279130, term279130.getClass(), "totalMapNum", 0);
        setLongField(term279130, term279130.getClass(), "totalHiScore", 0L);
        setLongField(term279130, term279130.getClass(), "totalBasicHighScore", 0L);
        setLongField(term279130, term279130.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term279130, term279130.getClass(), "totalExpertHighScore", 0L);
        setLongField(term279130, term279130.getClass(), "totalMasterHighScore", 0L);
        setLongField(term279130, term279130.getClass(), "totalUltimaHighScore", 0L);
        setField(term279130, term279130.getClass(), "eventWatchedDate", null);
        setIntField(term279130, term279130.getClass(), "friendCount", 0);
        setField(term279130, term279130.getClass(), "firstGameId", null);
        setField(term279130, term279130.getClass(), "firstRomVersion", null);
        setField(term279130, term279130.getClass(), "firstDataVersion", null);
        setField(term279130, term279130.getClass(), "firstPlayDate", null);
        setField(term279130, term279130.getClass(), "lastGameId", null);
        setField(term279130, term279130.getClass(), "lastRomVersion", null);
        setField(term279130, term279130.getClass(), "lastDataVersion", null);
        setField(term279130, term279130.getClass(), "lastLoginDate", null);
        setField(term279130, term279130.getClass(), "lastPlayDate", null);
        setIntField(term279130, term279130.getClass(), "lastPlaceId", 0);
        setField(term279130, term279130.getClass(), "lastPlaceName", null);
        setField(term279130, term279130.getClass(), "lastRegionId", null);
        setField(term279130, term279130.getClass(), "lastRegionName", null);
        setField(term279130, term279130.getClass(), "lastAllNetId", null);
        setField(term279130, term279130.getClass(), "lastClientId", null);
        setField(term279130, term279130.getClass(), "lastCountryCode", null);
        setField(term279130, term279130.getClass(), "userNameEx", null);
        setField(term279130, term279130.getClass(), "compatibleCmVersion", null);
        setIntField(term279130, term279130.getClass(), "medal", 0);
        setIntField(term279130, term279130.getClass(), "mapIconId", 0);
        setIntField(term279130, term279130.getClass(), "voiceId", 0);
        setIntField(term279130, term279130.getClass(), "avatarWear", 0);
        setIntField(term279130, term279130.getClass(), "avatarHead", 0);
        setIntField(term279130, term279130.getClass(), "avatarFace", 0);
        setIntField(term279130, term279130.getClass(), "avatarSkin", 0);
        setIntField(term279130, term279130.getClass(), "avatarItem", 0);
        setIntField(term279130, term279130.getClass(), "avatarFront", 0);
        setIntField(term279130, term279130.getClass(), "avatarBack", 0);
        setIntField(term279130, term279130.getClass(), "classEmblemBase", 0);
        setIntField(term279130, term279130.getClass(), "classEmblemMedal", 0);
        setIntField(term279130, term279130.getClass(), "stockedGridCount", 0);
        setIntField(term279130, term279130.getClass(), "exMapLoopCount", 0);
        setIntField(term279130, term279130.getClass(), "netBattlePlayCount", 0);
        setIntField(term279130, term279130.getClass(), "netBattleWinCount", 0);
        setIntField(term279130, term279130.getClass(), "netBattleLoseCount", 0);
        setIntField(term279130, term279130.getClass(), "netBattleConsecutiveWinCount", 0);
        setIntField(term279130, term279130.getClass(), "charaIllustId", 0);
        setIntField(term279130, term279130.getClass(), "skillId", 0);
        setIntField(term279130, term279130.getClass(), "overPowerPoint", 0);
        setIntField(term279130, term279130.getClass(), "overPowerRate", 0);
        setIntField(term279130, term279130.getClass(), "overPowerLowerRank", 0);
        setIntField(term279130, term279130.getClass(), "avatarPoint", 0);
        setIntField(term279130, term279130.getClass(), "battleRankId", 0);
        setIntField(term279130, term279130.getClass(), "battleRankPoint", 0);
        setIntField(term279130, term279130.getClass(), "eliteRankPoint", 0);
        setIntField(term279130, term279130.getClass(), "netBattle1stCount", 0);
        setIntField(term279130, term279130.getClass(), "netBattle2ndCount", 0);
        setIntField(term279130, term279130.getClass(), "netBattle3rdCount", 0);
        setIntField(term279130, term279130.getClass(), "netBattle4thCount", 0);
        setIntField(term279130, term279130.getClass(), "netBattleCorrection", 0);
        setIntField(term279130, term279130.getClass(), "netBattleErrCnt", 0);
        setIntField(term279130, term279130.getClass(), "netBattleHostErrCnt", 0);
        setIntField(term279130, term279130.getClass(), "battleRewardStatus", 0);
        setIntField(term279130, term279130.getClass(), "battleRewardIndex", 0);
        setIntField(term279130, term279130.getClass(), "battleRewardCount", 0);
        setIntField(term279130, term279130.getClass(), "ext1", 0);
        setIntField(term279130, term279130.getClass(), "ext2", 0);
        setIntField(term279130, term279130.getClass(), "ext3", 0);
        setIntField(term279130, term279130.getClass(), "ext4", 0);
        setIntField(term279130, term279130.getClass(), "ext5", 0);
        setIntField(term279130, term279130.getClass(), "ext6", 0);
        setIntField(term279130, term279130.getClass(), "ext7", 0);
        setIntField(term279130, term279130.getClass(), "ext8", 0);
        setIntField(term279130, term279130.getClass(), "ext9", 0);
        setIntField(term279130, term279130.getClass(), "ext10", 0);
        setField(term279130, term279130.getClass(), "extStr1", null);
        setField(term279130, term279130.getClass(), "extStr2", null);
        setLongField(term279130, term279130.getClass(), "extLong1", 0L);
        setLongField(term279130, term279130.getClass(), "extLong2", 0L);
        setField(term279130, term279130.getClass(), "rankUpChallengeResults", null);
        setBooleanField(term279130, term279130.getClass(), "isNetBattleHost", false);
        setIntField(term279130, term279130.getClass(), "netBattleEndState", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotalAdvancedHighScore", argTypes, term279130, args);
    }

};


