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

public class UserData_getExt5_33244931294 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4218736;

    public UserData_getExt5_33244931294() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4218736 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData"));
        setLongField(term4218736, term4218736.getClass(), "id", 0L);
        setField(term4218736, term4218736.getClass(), "card", null);
        setField(term4218736, term4218736.getClass(), "userName", null);
        setIntField(term4218736, term4218736.getClass(), "level", 0);
        setIntField(term4218736, term4218736.getClass(), "reincarnationNum", 0);
        setField(term4218736, term4218736.getClass(), "exp", null);
        setLongField(term4218736, term4218736.getClass(), "point", 0L);
        setLongField(term4218736, term4218736.getClass(), "totalPoint", 0L);
        setIntField(term4218736, term4218736.getClass(), "playCount", 0);
        setIntField(term4218736, term4218736.getClass(), "multiPlayCount", 0);
        setIntField(term4218736, term4218736.getClass(), "playerRating", 0);
        setIntField(term4218736, term4218736.getClass(), "highestRating", 0);
        setIntField(term4218736, term4218736.getClass(), "nameplateId", 0);
        setIntField(term4218736, term4218736.getClass(), "frameId", 0);
        setIntField(term4218736, term4218736.getClass(), "characterId", 0);
        setIntField(term4218736, term4218736.getClass(), "trophyId", 0);
        setIntField(term4218736, term4218736.getClass(), "playedTutorialBit", 0);
        setIntField(term4218736, term4218736.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term4218736, term4218736.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term4218736, term4218736.getClass(), "totalMapNum", 0);
        setLongField(term4218736, term4218736.getClass(), "totalHiScore", 0L);
        setLongField(term4218736, term4218736.getClass(), "totalBasicHighScore", 0L);
        setLongField(term4218736, term4218736.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term4218736, term4218736.getClass(), "totalExpertHighScore", 0L);
        setLongField(term4218736, term4218736.getClass(), "totalMasterHighScore", 0L);
        setLongField(term4218736, term4218736.getClass(), "totalUltimaHighScore", 0L);
        setField(term4218736, term4218736.getClass(), "eventWatchedDate", null);
        setIntField(term4218736, term4218736.getClass(), "friendCount", 0);
        setField(term4218736, term4218736.getClass(), "firstGameId", null);
        setField(term4218736, term4218736.getClass(), "firstRomVersion", null);
        setField(term4218736, term4218736.getClass(), "firstDataVersion", null);
        setField(term4218736, term4218736.getClass(), "firstPlayDate", null);
        setField(term4218736, term4218736.getClass(), "lastGameId", null);
        setField(term4218736, term4218736.getClass(), "lastRomVersion", null);
        setField(term4218736, term4218736.getClass(), "lastDataVersion", null);
        setField(term4218736, term4218736.getClass(), "lastLoginDate", null);
        setField(term4218736, term4218736.getClass(), "lastPlayDate", null);
        setIntField(term4218736, term4218736.getClass(), "lastPlaceId", 0);
        setField(term4218736, term4218736.getClass(), "lastPlaceName", null);
        setField(term4218736, term4218736.getClass(), "lastRegionId", null);
        setField(term4218736, term4218736.getClass(), "lastRegionName", null);
        setField(term4218736, term4218736.getClass(), "lastAllNetId", null);
        setField(term4218736, term4218736.getClass(), "lastClientId", null);
        setField(term4218736, term4218736.getClass(), "lastCountryCode", null);
        setField(term4218736, term4218736.getClass(), "userNameEx", null);
        setField(term4218736, term4218736.getClass(), "compatibleCmVersion", null);
        setIntField(term4218736, term4218736.getClass(), "medal", 0);
        setIntField(term4218736, term4218736.getClass(), "mapIconId", 0);
        setIntField(term4218736, term4218736.getClass(), "voiceId", 0);
        setIntField(term4218736, term4218736.getClass(), "avatarWear", 0);
        setIntField(term4218736, term4218736.getClass(), "avatarHead", 0);
        setIntField(term4218736, term4218736.getClass(), "avatarFace", 0);
        setIntField(term4218736, term4218736.getClass(), "avatarSkin", 0);
        setIntField(term4218736, term4218736.getClass(), "avatarItem", 0);
        setIntField(term4218736, term4218736.getClass(), "avatarFront", 0);
        setIntField(term4218736, term4218736.getClass(), "avatarBack", 0);
        setIntField(term4218736, term4218736.getClass(), "classEmblemBase", 0);
        setIntField(term4218736, term4218736.getClass(), "classEmblemMedal", 0);
        setIntField(term4218736, term4218736.getClass(), "stockedGridCount", 0);
        setIntField(term4218736, term4218736.getClass(), "exMapLoopCount", 0);
        setIntField(term4218736, term4218736.getClass(), "netBattlePlayCount", 0);
        setIntField(term4218736, term4218736.getClass(), "netBattleWinCount", 0);
        setIntField(term4218736, term4218736.getClass(), "netBattleLoseCount", 0);
        setIntField(term4218736, term4218736.getClass(), "netBattleConsecutiveWinCount", 0);
        setIntField(term4218736, term4218736.getClass(), "charaIllustId", 0);
        setIntField(term4218736, term4218736.getClass(), "skillId", 0);
        setIntField(term4218736, term4218736.getClass(), "overPowerPoint", 0);
        setIntField(term4218736, term4218736.getClass(), "overPowerRate", 0);
        setIntField(term4218736, term4218736.getClass(), "overPowerLowerRank", 0);
        setIntField(term4218736, term4218736.getClass(), "avatarPoint", 0);
        setIntField(term4218736, term4218736.getClass(), "battleRankId", 0);
        setIntField(term4218736, term4218736.getClass(), "battleRankPoint", 0);
        setIntField(term4218736, term4218736.getClass(), "eliteRankPoint", 0);
        setIntField(term4218736, term4218736.getClass(), "netBattle1stCount", 0);
        setIntField(term4218736, term4218736.getClass(), "netBattle2ndCount", 0);
        setIntField(term4218736, term4218736.getClass(), "netBattle3rdCount", 0);
        setIntField(term4218736, term4218736.getClass(), "netBattle4thCount", 0);
        setIntField(term4218736, term4218736.getClass(), "netBattleCorrection", 0);
        setIntField(term4218736, term4218736.getClass(), "netBattleErrCnt", 0);
        setIntField(term4218736, term4218736.getClass(), "netBattleHostErrCnt", 0);
        setIntField(term4218736, term4218736.getClass(), "battleRewardStatus", 0);
        setIntField(term4218736, term4218736.getClass(), "battleRewardIndex", 0);
        setIntField(term4218736, term4218736.getClass(), "battleRewardCount", 0);
        setIntField(term4218736, term4218736.getClass(), "ext1", 0);
        setIntField(term4218736, term4218736.getClass(), "ext2", 0);
        setIntField(term4218736, term4218736.getClass(), "ext3", 0);
        setIntField(term4218736, term4218736.getClass(), "ext4", 0);
        setIntField(term4218736, term4218736.getClass(), "ext5", 0);
        setIntField(term4218736, term4218736.getClass(), "ext6", 0);
        setIntField(term4218736, term4218736.getClass(), "ext7", 0);
        setIntField(term4218736, term4218736.getClass(), "ext8", 0);
        setIntField(term4218736, term4218736.getClass(), "ext9", 0);
        setIntField(term4218736, term4218736.getClass(), "ext10", 0);
        setField(term4218736, term4218736.getClass(), "extStr1", null);
        setField(term4218736, term4218736.getClass(), "extStr2", null);
        setLongField(term4218736, term4218736.getClass(), "extLong1", 0L);
        setLongField(term4218736, term4218736.getClass(), "extLong2", 0L);
        setField(term4218736, term4218736.getClass(), "rankUpChallengeResults", null);
        setBooleanField(term4218736, term4218736.getClass(), "isNetBattleHost", false);
        setIntField(term4218736, term4218736.getClass(), "netBattleEndState", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getExt5", argTypes, term4218736, args);
    }

};


