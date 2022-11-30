-- Part 1: Test it with SQL
--Id, name, employer, skills

-- Part 2: Test it with SQL

SELECT name FROM employer WHERE (location = "St. Louis City")

-- Part 3: Test it with SQL

DROP TABLE `techjobs`.`job`;

-- Part 4: Test it with SQL

SELECT skill.name
FROM skill
INNER JOIN job_skills ON job_skills.skills_id = skill.id
WHERE skills_id IS NOT NULL
ORDER BY skill.name ASC;